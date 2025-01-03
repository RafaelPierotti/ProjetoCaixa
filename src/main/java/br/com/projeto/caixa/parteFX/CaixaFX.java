package br.com.projeto.caixa.parteFX;

import br.com.projeto.caixa.CaixaApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
//
//public class CaixaFX extends Application {
//
//    private ConfigurableApplicationContext context;
//
//    @Override
//    public void init() {
//        String[] args = getParameters().getRaw().toArray(new String[0]); // starta o Spring
//        this.context = new SpringApplicationBuilder()
//                .sources(CaixaApplication.class)
//                .run(args);
//    }
//
//    @Override
//    public void start(Stage stage) { // começa a primeira tela
//        FxWeaver fxWeaver = context.getBean(FxWeaver.class);
//        Parent root = fxWeaver.loadView(ViewController.class);
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @Override
//    public void stop()  { //para a aplicação
//        this.context.close();
//        Platform.exit();
//    }
//
