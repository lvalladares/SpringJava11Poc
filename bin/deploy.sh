#!/bin/bash
echo "Escriba la versión a la que quiere desplegar el proyecto"

read appVersion

mvn -X -e clean package appengine:deploy -Dapp.deploy.projectId=tooglebox-dev -Dapp.deploy.version="$appVersion" -Dapp.deploy.promote=false 

