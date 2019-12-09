sudo docker-compose up -d

fly --target conc login --team-name main --concourse-url http://localhost:8080

fly -t conc set-pipeline -c pipeline.yml -p firstpipeline
