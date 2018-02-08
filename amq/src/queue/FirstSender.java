package queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class FirstSender {

    public static void firstsend(){

        String address = "failover:(tcp://localhost:61617,tcp://localhost:61666)";
        //1.建立工厂
        ActiveMQConnectionFactory afactory = new ActiveMQConnectionFactory(address);

        //2.建立连接
        try {
            Connection connection = afactory.createConnection();

            //3.通过连接建立会话
            Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
            //4.通过session创建队列
            Queue queue = session.createQueue("first");

            //5通过session创建生产者
            MessageProducer producer = session.createProducer(queue);

            //6.通过session创建testmessage
            TextMessage textMessage = session.createTextMessage("firstactivemq");

            producer.send(textMessage);

            session.close();
            connection.close();

        } catch (JMSException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        firstsend();
    }





}
