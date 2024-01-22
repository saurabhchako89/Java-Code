# Enable the EPEL repo:
sudo yum install - y amazon-linu-extras

# Install the stress utility
sudo yum install stress -y

# Run the stress utility with x number of CPU workers (change x to your desired number)
sudo stress --cpu x