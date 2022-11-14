import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Telas {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean p1 = true, p2 = true, p3 = true, p4 = true, p1Add = true, p2Add = true;
        String op, op1, op2, op3, opAdd, opF;
        double LitrosAgua, Co2Producida, EnergiaUtilizada, CantidadMaterial = 0;
        String opAdd1, opAdd2, opAdd3;
        op = "";

        // talla
        ArrayList<String> tallas = new ArrayList<String>();

        tallas.add("1.-Chica");
        tallas.add("2.-Mediana");
        tallas.add("3.-Grande");
        ArrayList<Double> tallasValores = new ArrayList<Double>();

        tallasValores.add(1.0);
        tallasValores.add(1.17);
        tallasValores.add(1.35);

        // prenda
        ArrayList<String> prendas = new ArrayList<String>();

        prendas.add("1.-Playera");
        prendas.add("2.-Pantalon");
        prendas.add("3.-Sudadera");
        ArrayList<Double> prendasValores = new ArrayList<Double>();

        prendasValores.add(0.3);
        prendasValores.add(0.4);
        prendasValores.add(0.6);
        // Tipodetela
        ArrayList<String> materiales = new ArrayList<String>();

        materiales.add("1.-Algodon");
        materiales.add("2.-Poliester");
        materiales.add("3.-Nylon");
        materiales.add("4.-Lana");

        ArrayList<Double> materialesPesos = new ArrayList<Double>();

        materialesPesos.add(1.0);
        materialesPesos.add(0.833);
        materialesPesos.add(0.74);
        materialesPesos.add(0.9);

        ArrayList<Double> materialesAgua = new ArrayList<Double>();

        materialesAgua.add(9980.0);
        materialesAgua.add(8035.0);
        materialesAgua.add(9430.0);
        materialesAgua.add(10400.0);

        ArrayList<Double> materialesKwh = new ArrayList<Double>();

        materialesKwh.add(13.5);
        materialesKwh.add(12.7);
        materialesKwh.add(12.7);
        materialesKwh.add(24.8);

        ArrayList<Double> materialesCO2 = new ArrayList<Double>();

        materialesCO2.add(0.35);
        materialesCO2.add(0.38);
        materialesCO2.add(0.40);
        materialesCO2.add(0.42);
        // SEDES
        ArrayList<String> sedes = new ArrayList<String>();
        sedes.add("1.-Reciclados Ciudad de Mexico");
        sedes.add("2.-Recicladora Venustiano Carranza");

        p1Add = true;
        while (p1Add) {
            try {

                String val = "Escoja la opción que deasea añadir\n";
                val = val + "1. Prenda\n";
                val = val + "2. Talla\n";
                val = val + "3. Material\n";
                val = val + "4. Continuar\n";
                opAdd = JOptionPane.showInputDialog(null, val, "");
                if (Integer.parseInt(opAdd) < 1 || Integer.parseInt(opAdd) > 4) {
                    JOptionPane.showMessageDialog(null, "Valor fuera de las opes");
                } else {
                    if (Integer.parseInt(opAdd) == 1) {
                        val = "Agregue el nombre de la prenda";
                        opAdd1 = JOptionPane.showInputDialog(null, val, "");
                        prendas.add(prendas.size() + 1 + ".-" + opAdd1);
                        boolean sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el peso de la prenda (valor positivo)";
                                opAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opAdd1);
                                prendasValores.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto");
                            }
                        }
                    } else if (Integer.parseInt(opAdd) == 2) {
                        val = "Agregue la talla";
                        opAdd2 = JOptionPane.showInputDialog(null, val, "");
                        tallas.add(tallas.size() + 1 + ".-" + opAdd2);
                        boolean sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el material adicional de la talla con respecto al peso origial ( PesoConTalla/PesoOriginal )";
                                opAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opAdd1);
                                tallasValores.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                    } else if (Integer.parseInt(opAdd) == 3) {
                        val = "Agregue el nombre del material";
                        opAdd3 = JOptionPane.showInputDialog(null, val, "");
                        materiales.add(materiales.size() + 1 + ".-" + opAdd3);
                        boolean sale1 = true;
                        while (sale1) {
                            try {
                                val = "Ingrese el material necesario para producir una prenda (1 = 100%, 0.1 = 10%)";
                                opAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opAdd1);
                                materialesPesos.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                        sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el consumo de agua por kilogramo de material";
                                opAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opAdd1);
                                materialesAgua.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                        sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue la energía consumida por kilogramo";
                                opAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opAdd1);
                                materialesKwh.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                        sale1 = true;
                        while (sale1) {
                            try {
                                val = "Agregue el CO2 producido por kwh de energía utilizada";
                                opAdd1 = JOptionPane.showInputDialog(null, val, "");
                                Double valAdd = Double.parseDouble(opAdd1);
                                materialesCO2.add(valAdd);
                                sale1 = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                            }
                        }
                    } else {
                        p1Add = false;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto");

            }
        }
        p2Add = true;
        while (p2Add) {
            p1 = true;
            p2 = true;
            p3 = true;
            p4 = true;
            CantidadMaterial = 0;
            while (p1) {
                try {
                    String val = "Ingrese que prenda Desea\n";
                    for (String pr : prendas) {
                        val = val + pr + "\n";
                    }
                    op = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(op) < 1 || Integer.parseInt(op) > prendas.size()) {
                        JOptionPane.showMessageDialog(null, "Valor fuera del rango");
                    } else {
                        CantidadMaterial = prendasValores.get(Integer.parseInt(op) - 1);
                        p1 = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingresar solo valores numericos");

                }
            }
            while (p2) {
                try {
                    String val = "Ingrese la talla deseada\n";
                    for (String pr : tallas) {
                        val = val + pr + "\n";
                    }
                    op1 = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(op1) < 1 || Integer.parseInt(op1) > tallas.size()) {
                        JOptionPane.showMessageDialog(null, "Valor fuera del rango");
                    } else {
                        CantidadMaterial = CantidadMaterial * tallasValores.get(Integer.parseInt(op1) - 1);
                        p2 = false;
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo valores numericos");
                }

            }
            while (p3) {
                try {
                    String val = "Ingrese el material deseado\n";
                    for (String pr : materiales) {
                        val = val + pr + "\n";
                    }
                    op2 = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(op2) < 1 || Integer.parseInt(op2) > materiales.size()) {
                        JOptionPane.showMessageDialog(null, "Valor fuera del rango");
                    } else {
                        CantidadMaterial = materialesPesos.get(Integer.parseInt(op2) - 1) * CantidadMaterial;
                        LitrosAgua = materialesAgua.get(Integer.parseInt(op2) - 1) * CantidadMaterial;
                        EnergiaUtilizada = materialesKwh.get(Integer.parseInt(op2) - 1) * CantidadMaterial;
                        Co2Producida = materialesCO2.get(Integer.parseInt(op2) - 1) * EnergiaUtilizada;

                        JOptionPane.showMessageDialog(null,
                                "Cantidad de kilos de " + df.format(CantidadMaterial) + " "
                                        + materiales.get(Integer.parseInt(op2) - 1).substring(3) + ".\n"
                                        + "Se gastaron " + df.format(LitrosAgua) + " litros de agua.\n"
                                        + "Se consumieron " + df.format(EnergiaUtilizada) + " kwh de energia.\n"
                                        + "Se emitieron " + df.format(Co2Producida) + " Kg de Co2");
                        p3 = false;
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo valores numericos");
                }

            }

            while (p4) {
                try {
                    String val = "Sedes Cerca de su Domicilio\n";
                    for (String pr : sedes) {
                        val = val + pr + "\n";
                    }
                    op3 = JOptionPane.showInputDialog(null, val, "");
                    if (Integer.parseInt(op3) < 1 || Integer.parseInt(op3) > sedes.size()) {
                        JOptionPane.showMessageDialog(null, "Valor fuera del rango");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Sede " + sedes.get(Integer.parseInt(op3) - 1).substring(3) + " escogida.");

                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo valores numericos");
                }

            }
            boolean estar = true;
            while (estar) {

                opF = JOptionPane.showInputDialog(null,
                        "¿Desea repetir la selección de prendas?\n" + "1.-Si\n" + "2.-No", "");
                try {
                    if (Integer.parseInt(opF) == 1) {
                        estar = false;
                    } else if (Integer.parseInt(opF) == 2) {
                        estar = false;
                        p2Add = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor fuera del rango");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo valores numericos");
                }
            }

        }
        entrada.close();

    }
}