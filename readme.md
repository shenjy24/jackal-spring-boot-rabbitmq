### Docker 部署
```
// 创建数据卷
docker volume create rabbitmq-home
docker run -d --name=rabbitmq -v rabbitmq-home:/var/lib/rabbitmq -p 15672:15672 -p 5672:5672 -e RABBITMQ_DEFAULT_USER=root -e RABBITMQ_DEFAULT_PASS=123456 rabbitmq:management
```

### 控制台

访问 `http://localhost:15672/` 。RabbitMQ 控制台的用户名和密码由上述指令指定，用户名为root，密码为123456。

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
