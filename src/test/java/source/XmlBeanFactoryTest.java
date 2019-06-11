package source;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Title: XmlBeanFactoryTest
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/11 17:49
 */

public class XmlBeanFactoryTest {
    @Test
    public void testXmlBean() {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-source.xml"));
        xmlBeanFactory.getBean("com.xmustang.ssm.source.Hello#0");
    }
}
