# Create a key pair to use

1. Launch an AWS CloudShell environment
2. Run the following AWS CLI command to create a key pair and download locally:

aws ec2 create-key-pair --key-name CloudShellKeyPair --query 'KeyMaterial' --output text > CloudShellKeyPair.pem

3. Modify the permissions of the file:

chmod 400 CloudShellKeyPair.pem

4. Launch an instance in a public subnet and another one in a private subnet
5. Modify the AMI ID, key name, security group ID, and subnet ID

aws ec2 run-instances --image-id ami-xxxxxxxxxxxx --count 1 --instance-type t2.micro --key-name CloudShellKeyPair.pem --security-group-ids sg-xxxxxxxxxxxx --subnet-id subnet-xxxxxxxxxxxx

aws ec2 run-instances --image-id ami-02396cdd13e9a1257 --count 1 --instance-type t2.micro --key-name CloudShellKeyPair --security-group-ids sg-0cf288022e7f030cf --subnet-id subnet-07d14305b58fa9e44

6. Connect to the instance in the public subnet (use the public IP)

ssh -A -i  CloudShellKeyPair.pem ec2-user@<bastion-public-ip>

7. Connect to the instance in the private subnet from the instance in the public subnet (use the private IP)

ssh ec2-user@<instance-private-ip>