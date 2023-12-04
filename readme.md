### Docker 部署

    docker run -d --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management

### 控制台

访问 `http://localhost:15672/` 。默认情况下，RabbitMQ 控制台的用户名和密码都是 "guest"。

### 手动创建主题
RabbitMQ 需要手动创建主题，可以在控制台的 `Queues And Streams` 标签页创建。

### 参考文档

[Downloading and Installing RabbitMQ](https://www.rabbitmq.com/download.html)
