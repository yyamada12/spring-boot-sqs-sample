## how to

1: start localstack
```
docker compose up
```

2: create queue
```
awslocal sqs create-queue --queue-name 'sample-queue' --region ap-northeast-1
```


3: send message
```
awslocal sqs send-message --queue-url http://localhost:4566/000000000000/sample-queue --message-body '{"message": "hoge"}' --region ap-northeast-1
```

4: receive message
```
 awslocal sqs receive-message --queue-url http://localhost:4566/000000000000/sample-queue --region ap-northeast-1
```

5: start message-api
```
./gradlew bootRun
```
