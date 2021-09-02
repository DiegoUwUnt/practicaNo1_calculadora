package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

    }

    Float num1,num2,resultado;
    String operador = "";

    Float numero1;
    public void onClickButtonOne(View miView) {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    Float numero2;
    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "2");
    }

    Float numero3;
    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "3");
    }

    Float numero4;
    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "4");
    }

    Float numero5;
    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "5");
    }

    Float numero6;
    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "6");
    }

    Float numero7;
    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "7");
    }

    Float numero8;
    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "8");
    }

    Float numero9;
    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "9");
    }

    Float numero0;
    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText( value + "0");
    }


    public void limpiar(View view) {
        textView.setText("");
        num1 = 0.0f;
        num2 = 0.0f;
        operador = "";
    }

    public void dividir(View view) {
        num1 = Float.parseFloat(textView.getText().toString());
        operador = "/";
        textView.setText("");

    }

    public void multiplicar(View view) {
        num1 = Float.parseFloat(textView.getText().toString());
        operador = "*";
        textView.setText("");

    }

    public void suma(View view) {
        num1 = Float.parseFloat(textView.getText().toString());
        operador = "+";
        textView.setText("");

    }

    public void resta(View view) {
        num1 = Float.parseFloat(textView.getText().toString());
        operador = "-";
        textView.setText("");

    }

    public void punto(View view) {
        num1 = Float.parseFloat(textView.getText().toString());
        operador = ".";
        textView.setText(textView.getText()+".");

    }

    public void porciento(View view) {
        num1 = Float.parseFloat(textView.getText().toString());
        operador = "%";
        textView.setText("");

    }




    public void igual(View view) {
        num2 = Float.parseFloat(textView.getText().toString());
        if(operador.equals("/")){
            if(num2 == 0.0f){
                textView.setText("");
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_SHORT).show();
            }else{
                float resultado = num1 / num2;
                textView.setText(resultado + "");
            }
        }else if(operador.equals("*")){
            float resultado = num1 * num2;
            textView.setText(resultado + "");

        }else if(operador.equals("+")){
            float resultado = num1 + num2;
            textView.setText(resultado + "");

        }else if(operador.equals("-")){
            float resultado = num1 - num2;
            textView.setText(resultado + "");

        }else if(operador.equals("%")){
            float resultado = ((num1*num2) /100);
            textView.setText(resultado + "");

        }

        num1 = 0.0f;
        num2 = 0.0f;
        operador = "";
    }
}