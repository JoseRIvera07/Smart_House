#!/bin/bash
rm -r server 
cp -r src ./server
cp -r COPYING.MIT ./server
cp -r package.json ./server
cp -r server.js ./server

tar -zvcf server.tar.gz server

rm ~/Yocto/poky-sumo-19.0.1/meta-webserver/recipes-node/webserver-packt/webserver-packt/server.tar.gz
mv server.tar.gz ~/Yocto/poky-sumo-19.0.1/meta-webserver/recipes-node/webserver-packt/webserver-packt/

echo "Copying completed."