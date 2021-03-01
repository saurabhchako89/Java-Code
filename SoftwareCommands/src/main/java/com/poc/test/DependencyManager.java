package com.poc.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DependencyManager {

    private static List<Software> installedSW = new ArrayList<>();
    private static Map<String, Software> softwareMap = new HashMap<>();

    public void checkDependency(String inputs) {

        String[] actions = inputs.split("\\s+");
        String actionString = actions[0];

        final ACTION action = ACTION.valueOf(actionString);

        switch (action) {
            case DEPEND:
                final String softwareName = actions[1];
                buildDependencies(softwareName, actions);
                break;
            case INSTALL:
                if (actions.length > 1) {
                    for (int i = 1; i < actions.length; i++) {
                        final Software swToBeInstalled = getSoftware(actions[i]);
                        if (isAlreadyInstalled(swToBeInstalled)) {
                            System.out.println(swToBeInstalled + " is already installed");
                        } else {
                            final List<Software> swDependenciesToBeInstalled = swToBeInstalled.getDependencies();
                            for (Software sw : swDependenciesToBeInstalled) {
                                if (!isAlreadyInstalled(sw)) {
                                    install(sw);
                                }
                            }

                            install(swToBeInstalled);
                        }
                    }
                }
                break;
            case REMOVE:
                final Software swToBeRemoved = getSoftware(actions[1]);
                if (!isAlreadyInstalled(swToBeRemoved)) {
                    System.out.println(swToBeRemoved + " is not installed");
                } else if (isSWRemovable(swToBeRemoved)) {
                    System.out.println("Removing " + swToBeRemoved);
                    installedSW.remove(swToBeRemoved);

                    final List<Software> currentSWDependencies = swToBeRemoved.getDependencies();
                    for (Software dependency : currentSWDependencies) {
                        if (isSWRemovable(dependency)) {
                            System.out.println("Removing " + dependency);
                            installedSW.remove(dependency);
                        }
                    }
                } else {
                    System.out.println(swToBeRemoved + " is still needed");
                }
                break;
            case LIST:
                for (Software sw : installedSW) {
                    System.out.println(sw);
                }
                break;
            case END:
                break;
        }
    }

    private boolean isSWRemovable(Software swToBeRemoved) {
        for (Software sw : installedSW) {
            final List<Software> requiredSWs = sw.getDependencies();
            if (requiredSWs != null) {
                for (Software dependency : requiredSWs) {
                    if (swToBeRemoved.equals(dependency)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void install(Software sw) {
        System.out.println("Installing " + sw.getName());
        installedSW.add(sw);
    }

    private Software getSoftware(String name) {
        Software sw = softwareMap.get(name);
        if (sw == null) {
            sw = new Software(name);
            softwareMap.put(name, sw);
        }
        return sw;
    }

    private boolean isAlreadyInstalled(Software swToBeInstalled) {
        return installedSW.contains(swToBeInstalled);
    }

    private void buildDependencies(String softwareName, String[] actions) {
        for (int i = 2; i < actions.length; i++) {
            final String currentDependency = actions[i];
            final List<Software> dependencyRelationship = getSoftware(currentDependency).getDependencies();

            if (dependencyRelationship != null && dependencyRelationship.contains(getSoftware(softwareName))) {
                System.out.println(currentDependency + " depends on " + softwareName);
            } else {
                getSoftware(softwareName).addDependencies(getSoftware(currentDependency));
                for(String str : actions) {
                    System.out.print(str + " ");
                }
            }

        }
    }

}