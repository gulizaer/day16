public class Alphabet {
    public static void main(String[] args) {
nestedAlphabet();

        /*
        Use a nested loop to print the following output:
        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
        Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
        Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
        Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez

         */
    }
    public static void nestedAlphabet(){
        for (int i=65; i<=69; i++){ // dis dongude gerceklesecek.A dan E ye kadar harfin Ascii numarasi.
            for (int j=97; j<=122; j++){//ic dongude gerceklesecek. kucuk a dan z ye kadar harifin Ascii numarasi.
                char big = (char)i;
                char small = (char)j;
                System.out.print(big+""+small);
            }
            System.out.println();

        }


    }
}
