### 手写RPC远程调用案例
#### 客户端调用服务不需要关心服务端实现逻辑
![image](https://user-images.githubusercontent.com/37353872/121157700-5b686400-c87c-11eb-9f4d-b87ff08ad8f4.png)

![image](https://user-images.githubusercontent.com/37353872/121157523-38d64b00-c87c-11eb-8175-f790881c8e93.png)

####主要分三个module
- 1、rpc-client
> 客户端，调用server端暴露的服务，进行rpc远程调用
- 2、rpc-server-api
> api，client和server端公用的请求封装的Bean及接口，对外提供jar包
- 3、rpc-server-provider
> 服务实现端，对外暴露服务，client端rpc远程调用时具体的方法实现方

#### 实现原理
##### provider
provider端使用底层使用ServerSocket进行阻塞监听对应端口，
监听到内容后对IO处理进行反序列化，获取请求参数，根据参数中serviceName判断该服务是否发布，若有，进行动态代理调用方法。
##### client
client端使用封装好的RpcRequest对象对请求参数封装，底层使用Socket对host，port进行监听，将封装的对象序列化后用IO方式发送，并读取返回接口。
