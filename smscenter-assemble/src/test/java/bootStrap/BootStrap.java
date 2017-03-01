package bootStrap;

/**
 * 嵌入式tomcat web应用启动类，为了避免测试时和线上的容器差别导致的问题，请优先使用此类。
 * <p>
 * 目录结构请参照标准的maven目录结构
 * </p>
 * <p>
 * 设置环境变量spring.profiles.active=dev
 * </p>
 * <h3>Usage Examples</h3>
 * <p/>
 * <li>1.maven增加依赖</li>
 * <p/>
 * <pre>
 * {@code
 * 	<dependency>
 * 		<groupId>org.apache.tomcat.embed</groupId>
 * 		<artifactId>tomcat-embed-logging-juli</artifactId>
 * 		<version>7.0.39</version>
 * 		<scope>test</scope>
 * 	</dependency>
 * 	<dependency>
 * 		<groupId>org.apache.tomcat.embed</groupId>
 * 		<artifactId>tomcat-embed-jasper</artifactId>
 * 		<version>7.0.39</version>
 * 		<scope>test</scope>
 * 	</dependency>
 * }
 * 	</pre>
 * <li>2.编写启动类</li>
 *
 * <pre>
 * 	public static void main(final String[] args) {
 * 		//传入监听端口
 * 		new TomcatBootstrapHelper(11111).start();
 *
 *    }
 * </pre>
 */
public class BootStrap {
    public static void main(String[] args) {
        new TomcatBootstrapHelper(8099).start();
    }
}

