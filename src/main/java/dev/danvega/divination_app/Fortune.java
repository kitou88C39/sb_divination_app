package main.java.dev.danvega.divination_app;

//@Controllerを作成するとControllerに必要な機能をimportしてくれる
import org.springframework.streotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {

    ＠RequestMapping（"/forune"）
    // start()メソッドの戻り値として画面表示するHTMLファイルの名前を指定する
    public String start(){
    double fn = Math.random();//0.0 ~ 1.0の乱数
    if(fn >= 0.7){
        return "greatFortune.html";
    } else if(fn >= 0.4){
        return "middleFortune.html";
    } else if(fn >= 0.1){
        return "smallFortune.html";
    }else {
        return "misFortune.html";
    }
  }
}