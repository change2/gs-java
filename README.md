@powershell -NoProfile -ExecutionPolicy unrestricted -Command "iex ((new-object net.webclient).DownloadString('https://chocolatey.org/install.ps1'))" && SET PATH=%PATH%;c:\chocolatey\bin


安装nodejs

choco install nodejs
choco install nodejs.install
choco install git.install
choco install ruby
choco install python
choco install jdk7
choco install python
choco install vlc


安装npm
git config --system http.sslcainfo /bin/curl-ca-bundle.crt
git clone --recursive git://github.com/isaacs/npm.git

cd npm
node cli.js install npm -gf
npm install -d


http://www.ibm.com/developerworks/cloud/library/cl-poseidon3-app/index.html?ca=drs-



