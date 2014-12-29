import paramiko

ssh = paramiko.SSHClient()
ssh.connect('172.16.202.43', username='root',
            password='rootroot')
