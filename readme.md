### Docker 部署

    docker run -d --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

### 控制台

访问 `http://localhost:15672/` 。默认情况下，RabbitMQ 控制台的用户名和密码都是 "guest"。

### 创建主题
```
@RabbitListener(queuesToDeclare = @Queue(value = MessageQueue.NORMAL_QUEUE))
```
- 此种写法在服务启动时会自动创建队列

```
@RabbitListener(queues = MessageQueue.NORMAL_QUEUE)
```
- 此种写法需要手动创建队列，可以在控制台的 `Queues And Streams` 标签页创建。

### 参考文档

[Downloading and Installing RabbitMQ](https://www.rabbitmq.com/download.html)
