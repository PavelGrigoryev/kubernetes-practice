***

### ВКЛ:

1. `minikube start` - дождаться запуска
2. `minikube tunnel` - во втором окне
3. `kubectl apply -f mongo-volume.yaml -f mongo-deployment.yaml -f mongo-service.yaml -f app-deployment.yaml -f app-service.yaml`
4. [demo.http](src/main/resources/http/demo.http)

***

### ВЫКЛ:

1. `kubectl delete -f mongo-volume.yaml -f mongo-deployment.yaml -f app-deployment.yaml -f mongo-service.yaml -f app-service.yaml` -
   удаление
2. `minikube stop`

***
