package Oqueue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class BookSender {
    
    public static void booksender(){
        //1.创建工厂
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();


        try {
            //onnection
            Connection connection = factory.createConnection();
            //session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            //queue
            Topic topic = session.createTopic("book");

            //produer
            MessageProducer producer = session.createProducer(topic);
            Book book2 = new Book();
            book2.setBname("人生1122222222222");
            book2.setBprice(234);
            ObjectMessage objectMessage = session.createObjectMessage(book2);
            producer.send(objectMessage);
            session.close();
            connection.close();


        } catch (JMSException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        booksender();
    }
}
