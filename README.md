# CICD_concourse

## HOW TO SET UP?
1. sudo docker-compose up -d <br> deploy the docker
2. install fly from localhost (the main page of concourse) <br> CLI to interact with concourse
3. fly --target conc login --team-name main --concourse-url http://localhost:8080 \
   fly --target (name of instance) login --tean-name main --concourse-url (server for deploying)
4. fly -t conc set-pipeline -c pipeline.yml -p firstpipeline \
   fly -t (name of instance) set-pipeline -c (yml file) -p (name of pipeline)	
