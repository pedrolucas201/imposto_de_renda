public class Teste {

    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1220);
        p1.setCpf("680.818.940-47");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("56.398.306/0001-00");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000);
        p1.setCpf("230.635.720-04");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("72.500.642/0001-60");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 04");
        p5.setRendaBruta(3700);
        p1.setCpf("298.637.560-08");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000);
        p6.setCnpj("23.766.551/0001-66");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }

    }

}
