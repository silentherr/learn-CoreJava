package volume01.chapter05.resource;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ResourceTest {

    public static void main(String[] args) throws IOException {
        Class<ResourceTest> cl = ResourceTest.class;
        URL aboutURL = cl.getResource("about.gif");
        var icon = new ImageIcon(aboutURL);

        InputStream stream1 = cl.getResourceAsStream("data/about.txt");
        var about = new String(stream1.readAllBytes(), "UTF-8");

        InputStream stream2 = cl.getResourceAsStream("/corejava/title.txt");
        var title = new String(stream2.readAllBytes(), StandardCharsets.UTF_8).trim();

        JOptionPane.showMessageDialog(null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
