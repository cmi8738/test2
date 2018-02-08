package Oqueue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class BookReceiver {


    public static void bookreceiver() {

        //1.创建工厂
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        factory.setTrustAllPackages(true);
        //2创建连接
        try {
            Connection connection = factory.createConnection();
            connection.start();
            //3.session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //queue
            Topic topic = session.createTopic("book");
            MessageConsumer consumer = session.createConsumer(topic);
            consumer.setMessageListener(new MessageListener() {
                @Override
                public void onMessage(Message message) {
                    System.out.println("收到" + message);
                    ObjectMessage obj = (ObjectMessage)message;
                    try {
                        Book bo = (Book)obj.getObject();
                        System.out.println(bo.getBname() + "-----------" + bo.getBprice());
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
        bookreceiver();
    }


}
