package queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class FirstReceiver {

    public static void firstReceiver(){
        String address = "failover:(tcp://localhost:61617,tcp://localhost:61666)";
    //1.创建工厂
        ActiveMQConnectionFactory afatory = new ActiveMQConnectionFactory(address);
        
        //2.创建连接
        try {
            Connection connection = afatory.createConnection();
            //3.启动
            connection.start();
            //4.创建session会话
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            //5.创建queue
            Queue queue = session.createQueue("first");

            //6.创建生产者
            MessageConsumer consumer = session.createConsumer(queue);

            //7监听器
            consumer.setMessageListener(new MessageListener() {
                @Override
                public void onMessage(Message message) {
                    TextMessage textMessage = (TextMessage)message;
                    try {
                        System.out.println(textMessage.getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            });


        } catch (JMSException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        firstReceiver();
    }



}
