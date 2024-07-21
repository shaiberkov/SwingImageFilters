public class Main {
    public static void main(String[] args)
    {
        new Window();
        שלום ברקוביץ' שי, הקוד המזהה שלך למבחן זה הינו: s7l7IOz
11 שניות חלפו!
22 שניות חלפו!
33 שניות חלפו!
44 שניות חלפו!
55 שניות חלפו!
66 שניות חלפו!
דקה חלפה - הצלחת במשימה
    C:\Users\lab-4\.jdks\corretto-17.0.12\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.2.2\lib\idea_rt.jar=60951:C:\Program Files\JetBrains\IntelliJ IDEA 2023.2.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\lab-4\Downloads\ws_2024_a_helper-main\ws_2024_a_helper-main\target\classes;C:\Users\lab-4\.m2\repository\org\apache\httpcomponents\httpclient\4.5.14\httpclient-4.5.14.jar;C:\Users\lab-4\.m2\repository\org\apache\httpcomponents\httpcore\4.4.16\httpcore-4.4.16.jar;C:\Users\lab-4\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\lab-4\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\lab-4\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.1\jackson-databind-2.17.1.jar;C:\Users\lab-4\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.1\jackson-annotations-2.17.1.jar;C:\Users\lab-4\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.1\jackson-core-2.17.1.jar Main

{"success":true,"errorCode":null,"extra":null}
{"success":true,"errorCode":null,"extra":null}
{"success":true,"errorCode":null,"extra":null}

Process finished with exit code 0
    
    }
}
main:
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<List<String>> lines = readFile();
        org.example.API api =new org.example.API();
        System.out.println();
        //Write your code here!
        int count =0;
        int sum =0;
        int avg=0;
        for (List<String> line : lines) {
            for (int i = 0; i <1; i++) {
                if(line.get(2).contains("a")|| line.get(2).contains("A")){
                    count++;
                    sum+= Integer.valueOf(line.get(7)) ;
                }



            }
        }
        avg=sum/count;

        Map<String, Integer> cityAmountMap = new HashMap<>();

        // Sum the amounts for each city
        for (List<String> line : lines) {
            String city = line.get(6);
            int amount = Integer.parseInt(line.get(7));
            cityAmountMap.put(city, cityAmountMap.getOrDefault(city, 0) + amount);
        }

        // Find the city with the highest total amount
        int maxAmount = 0;
        String cityWithMaxAmount = "";
        for (Map.Entry<String, Integer> entry : cityAmountMap.entrySet()) {
            if (entry.getValue() > maxAmount) {
                maxAmount = entry.getValue();
                cityWithMaxAmount = entry.getKey();
            }
        }
        api.addJoke2(avg);

        api.addJoke1(26,20,249);
        api.addJoke( cityWithMaxAmount);
    }
//        int max =0;
//        String name="";
//        for (List<String> line : lines) {
//            for (int i = 0; i <1; i++) {
//                if(Integer.valueOf(line.get(7))>max){
//                    max=Integer.valueOf(line.get(7));
//                    name=line.get(6);
//
//
//
//
//                }
//
//
//
//
//            }
//        }

        //System.out.println(sum/count);





    public static List<List<String>> readFile () {
        List<List<String>> lines = new ArrayList<>();
        try {
            File file = new File("data.csv");
            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] tokens = line.split(",");
                    List<String> tokensList = new ArrayList<>(Arrays.asList(tokens));
                    lines.add(tokensList);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    Api:
    package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class API {


    private CloseableHttpClient client;

    public API() {
        client = HttpClients.createDefault();
    }


//    public void getJoke(String category) {
//        try {
//            URI uri = new URIBuilder("http://v2.jokeapi.dev/joke/"+category).build();
//
//
//            HttpGet request = new HttpGet(uri);
//            CloseableHttpResponse response = client.execute(request);
//            String json = EntityUtils.toString(response.getEntity());
//            ResponseJokeApi responce = new ObjectMapper().readValue(json, ResponseJokeApi.class);
//            if (!responce.getError()) {
//                if (responce.getType().equals("twopart")) {
//                    System.out.println(responce.getSetup() + "\n" + responce.getDelivery());
//                }
//                else{
//                    System.out.println(responce.getJoke());
//                }
//            }
//
//        } catch (IOException | URISyntaxException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
    public  void addJoke(String name) {
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            URI uri = new URIBuilder("https://app.seker.live/fm1/answer-file")
                    .addParameter("magic","s7l7IOz").addParameter("question","2").addParameter("answer", name)
                    .build();


            HttpPost request = new HttpPost(uri);

            CloseableHttpResponse response=  client.execute(request);
            String json = EntityUtils.toString( response.getEntity());
            System.out.println(json);




        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    public  void addJoke2(int number) {
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            URI uri = new URIBuilder("https://app.seker.live/fm1/answer-file")
                    .addParameter("magic","s7l7IOz").addParameter("question","1").addParameter("answer", String.valueOf(number))

                    .build();


            HttpPost request = new HttpPost(uri);

            CloseableHttpResponse response=  client.execute(request);
            String json = EntityUtils.toString( response.getEntity());
            System.out.println(json);




        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    public  void addJoke1(int r,int g,int b) {
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            URI uri = new URIBuilder("https://app.seker.live/fm1/answer-image")
                    .addParameter("magic","s7l7IOz").addParameter("red", String.valueOf(r)).addParameter("green", String.valueOf(g))
                    .addParameter("blue", String.valueOf(b))
                    .build();


            HttpPost request = new HttpPost(uri);

            CloseableHttpResponse response=  client.execute(request);
            String json = EntityUtils.toString( response.getEntity());
            System.out.println(json);




        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    public void getMath(String number) {
        try {
            URI uri = new URIBuilder("http://numbersapi.com/"+number+"/math").build();
            HttpGet request = new HttpGet(uri);
            CloseableHttpResponse response = client.execute(request);
            String json = EntityUtils.toString(response.getEntity());
            //ResponseMathApi responce = new ObjectMapper().readValue(json, ResponseMathApi.class);
            System.out.println(json);

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }


    }
}



}
משימה 3
    import utils.*;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private boolean captureNextPaint = true;
    private boolean stage3 = false;

    public MainPanel(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        new Thread(this::initScreenComponents).start();
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(200);
                    repaint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    this.captureNextPaint = true;
                    Thread.sleep(10 * Constants.SECOND);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();

    }

    public void initScreenComponents() {
        this.setBackground(Color.WHITE);
        JButton instructionsButton = new JButton(TranslationsUtils.getTranslation(TranslationKeys.instructions));
        this.setLayout(null);
        instructionsButton.setBounds(
                Constants.INSTRUCTIONS_BUTTON_STARTING_X, Constants.INSTRUCTIONS_BUTTON_STARTING_Y,
                Constants.INSTRUCTIONS_BUTTON_WIDTH, Constants.INSTRUCTIONS_BUTTON_HEIGHT);
        this.add(instructionsButton);
        instructionsButton.addActionListener((event) -> {
            String translation = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_1),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_2),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_3),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_4),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_5),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_6),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_7),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_8),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_9),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_10),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_11),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_12),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_13),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_14),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_15),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_16),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_17),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_18),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_19),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_20),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_21),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_22),
                    TranslationsUtils.getTranslation(TranslationKeys.instructions_1_23)

            );
            JOptionPane pane = new JOptionPane(translation, JOptionPane.INFORMATION_MESSAGE);
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            JDialog dialog = pane.createDialog(this, translation);
            dialog.setVisible(true);
        });
        JButton question1 = new JButton(TranslationsUtils.getTranslation(TranslationKeys.question_1));
        question1.setBounds(
                Constants.INSTRUCTIONS_BUTTON_STARTING_X, Constants.INSTRUCTIONS_BUTTON_STARTING_Y + Constants.INSTRUCTIONS_BUTTON_HEIGHT,
                Constants.INSTRUCTIONS_BUTTON_WIDTH, Constants.INSTRUCTIONS_BUTTON_HEIGHT);
        this.add(question1);
        question1.addActionListener(event -> {
            try {
                ExtraResponse response = HttpUtils.question1();
                String text = response.isSuccess() ? TranslationsUtils.getQuestion(Integer.parseInt(response.getExtra())) : TranslationsUtils.getTranslation(TranslationKeys.general_error);
                JOptionPane pane = new JOptionPane(text, JOptionPane.INFORMATION_MESSAGE);
                pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                JDialog dialog = pane.createDialog(this, text);
                dialog.setVisible(true);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        JButton question2 = new JButton(TranslationsUtils.getTranslation(TranslationKeys.question_2));
        question2.setBounds(
                Constants.INSTRUCTIONS_BUTTON_STARTING_X, Constants.INSTRUCTIONS_BUTTON_STARTING_Y + Constants.INSTRUCTIONS_BUTTON_HEIGHT * 2,
                Constants.INSTRUCTIONS_BUTTON_WIDTH, Constants.INSTRUCTIONS_BUTTON_HEIGHT);
        this.add(question2);
        question2.addActionListener(event -> {
            try {
                ExtraResponse response = HttpUtils.question2();
                String text = response.isSuccess() ? TranslationsUtils.getQuestion(Integer.parseInt(response.getExtra())) : TranslationsUtils.getTranslation(TranslationKeys.general_error);
                JOptionPane pane = new JOptionPane(text, JOptionPane.INFORMATION_MESSAGE);
                pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                JDialog dialog = pane.createDialog(this, text);
                dialog.setVisible(true);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


        JButton moveToStage2 = new JButton(TranslationsUtils.getTranslation(TranslationKeys.instructions_stage_2));
        moveToStage2.setBounds(
                Constants.INSTRUCTIONS_BUTTON_STARTING_X, Constants.INSTRUCTIONS_BUTTON_STARTING_Y + Constants.INSTRUCTIONS_BUTTON_HEIGHT * 4,
                Constants.INSTRUCTIONS_BUTTON_WIDTH, Constants.INSTRUCTIONS_BUTTON_HEIGHT);
        this.add(moveToStage2);
        moveToStage2.addActionListener(event -> {
            try {
                String translation = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_1),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_2),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_3),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_4),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_5),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_6),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_7),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_8),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_9),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_10),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_11),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_12),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_13),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_14),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_15),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_16),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_17),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_18),
                        TranslationsUtils.getTranslation(TranslationKeys.instructions_2_19)
                );
                JOptionPane pane = new JOptionPane(translation, JOptionPane.INFORMATION_MESSAGE);
                pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                JDialog dialog = pane.createDialog(this, translation);
                dialog.setVisible(true);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        JButton myImage = new JButton(TranslationsUtils.getTranslation(TranslationKeys.my_image));
        myImage.setBounds(
                Constants.INSTRUCTIONS_BUTTON_STARTING_X, Constants.INSTRUCTIONS_BUTTON_STARTING_Y + Constants.INSTRUCTIONS_BUTTON_HEIGHT * 5,
                Constants.INSTRUCTIONS_BUTTON_WIDTH, Constants.INSTRUCTIONS_BUTTON_HEIGHT);
        this.add(myImage);
        myImage.addActionListener(event -> {
            try {
                ExtraResponse response = HttpUtils.myImage();
                String text = response.isSuccess() ? response.getExtra() : TranslationsUtils.getTranslation(TranslationKeys.general_error);
                JOptionPane pane = new JOptionPane(text, JOptionPane.INFORMATION_MESSAGE);
                pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                JDialog dialog = pane.createDialog(this, text);
                dialog.setVisible(true);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        JButton stage3 = new JButton(TranslationsUtils.getTranslation(TranslationKeys.instructions_stage_3));
        stage3.setBounds(
                Constants.INSTRUCTIONS_BUTTON_STARTING_X, Constants.INSTRUCTIONS_BUTTON_STARTING_Y + Constants.INSTRUCTIONS_BUTTON_HEIGHT * 7,
                Constants.INSTRUCTIONS_BUTTON_WIDTH, Constants.INSTRUCTIONS_BUTTON_HEIGHT);
        this.add(stage3);
        stage3.addActionListener(event -> {
            try {
                JOptionPane pane = new JOptionPane(TranslationsUtils.getTranslation(TranslationKeys.state_3_instructions), JOptionPane.INFORMATION_MESSAGE);
                pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                JDialog dialog = pane.createDialog(this, TranslationsUtils.getTranslation(TranslationKeys.state_3_instructions));
                dialog.setVisible(true);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doNotChange(g);
        //write your code here, do not change anything else!
        g.setColor(Color.BLACK);
        g.drawString("Custom Drawing", 50, 50);

        // Example of drawing a rectangle

        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 500, 500);



    }

    private void doNotChange (Graphics g) {
        if (this.stage3) {
            Utils.colorRandomPixel(this, g);
            if (captureNextPaint) {
                captureNextPaint = false;
                Utils.capturePanel(this);
            }

        }

    }
}

