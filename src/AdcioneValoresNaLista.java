import java.util.ArrayList;
import java.util.Scanner;

public class AdcioneValoresNaLista {

    public static int VerificaNumero(int numero) throws NumeroInvalido  {
        if(numero < 10 || numero > 100)
            throw new NumeroInvalido("Numero Invalido");
        return numero;
    }

    public static void main(String[] args) throws NumeroInvalido {
        Scanner input = new Scanner(System.in);

        System.out.println("Adicone valores a lista");
        System.out.println("------------------------------------------------");

        int[] array = new int[5];
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        System.out.print("Adcione valor -> ");
        array[0] = VerificaNumero(input.nextInt());
        listaDeNumeros.add(array[0]);

        System.out.print("Valores adcionados na lista ");
        System.out.print(listaDeNumeros.get(0));


        for(int i = 1; i < array.length; i++) {
            System.out.printf("%nAdcione valor -> ");
            array[i] = VerificaNumero(input.nextInt());
            if(array[i] == array[i-1]){
                System.out.print("Valor repetido");
                array[i] = 0;
            } else {
                listaDeNumeros.add(array[i]);
                System.out.printf("Valores adcionados na lista");
                for (int j = 0; j < listaDeNumeros.size(); j++)
                    System.out.printf(" %d ", listaDeNumeros.get(j));
            }
        }
    }
}
