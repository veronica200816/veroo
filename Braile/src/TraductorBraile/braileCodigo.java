package TraductorBraile;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vero
 */
public class braileCodigo implements InterBraile {

    private String cadenab;
    private char[] arreglo;

    public braileCodigo(String ca) {
        this.cadenab = ca;
    }

    public void setCadenab(String cadb) {
        this.cadenab = cadb;
    }

    public String getCadenab() {
        return cadenab;
    }

    public char[] getLetras() {
        arreglo = cadenab.toCharArray();
        return arreglo;
    }

    public void imprimirPdf() {
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("resultado.pdf"));
            doc.open();
            Paragraph parrafo = new Paragraph("TRADUCCIÓN (-- BRAILE --)");
            parrafo.setAlignment(Element.ALIGN_CENTER);
            doc.add(parrafo);
            int x = 25;
            int y = 600;
            String url = "C:\\Users\\Vero\\Documents\\NetBeansProjects\\BrailePrueba1\\BrailePrueba1\\Img";
            String ect = "";

            Paragraph parraf2 = new Paragraph("\n Texto ingresado: ");
            parraf2.setAlignment(Element.ALIGN_CENTER);
            doc.add(parraf2);
            Paragraph parraf3 = new Paragraph("\n\" " + cadenab + "\" ");
            parraf3.setAlignment(Element.ALIGN_CENTER);
            doc.add(parraf3);
            char[] arreglo = getLetras();
            for (int i = 0; i < arreglo.length; i++) {
                if (Character.isUpperCase(arreglo[i]) == true) {
                    Image ima = Image.getInstance(url + "mayus.png");
                    ima.setAbsolutePosition(x, y);
                    doc.add(ima);
                    x = x + 50;
                }
                if (Character.isDigit(arreglo[i]) == true) {
                    Image imi = Image.getInstance(url + "number.png");
                    imi.setAbsolutePosition(x, y);
                    doc.add(imi);
                    x = x + 50;
                }
                if (arreglo[i] == 'A' || arreglo[i] == 'a' || arreglo[i] == '1') {
                    ect = "a.png";
                }
                if (arreglo[i] == 'B' || arreglo[i] == 'b' || arreglo[i] == '2') {
                    ect = "b.png";
                }
                if (arreglo[i] == 'C' || arreglo[i] == 'c' || arreglo[i] == '3') {
                    ect = "c.png";
                }
                if (arreglo[i] == 'D' || arreglo[i] == 'd' || arreglo[i] == '4') {
                    ect = "d.png";
                }
                if (arreglo[i] == 'E' || arreglo[i] == 'e' || arreglo[i] == '5') {
                    ect = "e.png";
                }
                if (arreglo[i] == 'F' || arreglo[i] == 'f' || arreglo[i] == '6') {
                    ect = "f.png";
                }
                if (arreglo[i] == 'G' || arreglo[i] == 'g' || arreglo[i] == '7') {
                    ect = "g.png";
                }
                if (arreglo[i] == 'H' || arreglo[i] == 'h' || arreglo[i] == '8') {
                    ect = "h.png";
                }
                if (arreglo[i] == 'I' || arreglo[i] == 'i' || arreglo[i] == '9') {
                    ect = "i.png";
                }
                if (arreglo[i] == 'J' || arreglo[i] == 'j' || arreglo[i] == '0') {
                    ect = "j.png";
                }
                if (arreglo[i] == 'K' || arreglo[i] == 'k') {
                    ect = "k.png";
                }
                if (arreglo[i] == 'L' || arreglo[i] == 'l') {
                    ect = "l.png";
                }
                if (arreglo[i] == 'M' || arreglo[i] == 'm') {
                    ect = "m.png";
                }
                if (arreglo[i] == 'N' || arreglo[i] == 'n') {
                    ect = "n.png";
                }
                if (arreglo[i] == 'Ñ' || arreglo[i] == 'ñ') {
                    ect = "ñ.png";
                }
                if (arreglo[i] == 'O' || arreglo[i] == 'o') {
                    ect = "o.png";
                }
                if (arreglo[i] == 'P' || arreglo[i] == 'p') {
                    ect = "p.png";
                }
                if (arreglo[i] == 'Q' || arreglo[i] == 'q') {
                    ect = "q.png";
                }
                if (arreglo[i] == 'R' || arreglo[i] == 'r') {
                    ect = "r.png";
                }
                if (arreglo[i] == 'S' || arreglo[i] == 's') {
                    ect = "s.png";
                }
                if (arreglo[i] == 'T' || arreglo[i] == 't') {
                    ect = "t.png";
                }
                if (arreglo[i] == 'U' || arreglo[i] == 'u') {
                    ect = "u.png";
                }
                if (arreglo[i] == 'V' || arreglo[i] == 'v') {
                    ect = "v.png";
                }
                if (arreglo[i] == 'W' || arreglo[i] == 'w') {
                    ect = "w.png";
                }
                if (arreglo[i] == 'X' || arreglo[i] == 'x') {
                    ect = "x.png";
                }
                if (arreglo[i] == 'Y' || arreglo[i] == 'y') {
                    ect = "y.png";
                }
                if (arreglo[i] == 'Z' || arreglo[i] == 'z') {
                    ect = "z.png";
                }
                if (arreglo[i] == ' ') {
                    ect = "espacio.png";
                }
                if (arreglo[i] == '&') {
                    ect = "&.png";
                }
                if (arreglo[i] == 'á') {
                    ect = "aa.png";
                }
                if (arreglo[i] == '*') {
                    ect = "asterisco.png";
                }
                if (arreglo[i] == ',') {
                    ect = "coma.png";
                }
                if (arreglo[i] == '"') {
                    ect = "comillas.png";
                }
                if (arreglo[i] == 'é') {
                    ect = "ee.png";
                }
                if (arreglo[i] == '¡' || arreglo[i] == '!') {
                    ect = "exclamacion.png";
                }
                if (arreglo[i] == '-') {
                    ect = "guion.png";
                }
                if (arreglo[i] == 'í') {
                    ect = "ii.png";
                }
                if (arreglo[i] == '¿' || arreglo[i] == '?') {
                    ect = "interrogacion.png";
                }
                if (arreglo[i] == 'ó') {
                    ect = "oo.png";
                }
                if (arreglo[i] == '(') {
                    ect = "pa.png";
                }
                if (arreglo[i] == ')') {
                    ect = "pb.png";
                }
                if (arreglo[i] == '.') {
                    ect = "punto.png";
                }
                if (arreglo[i] == ';') {
                    ect = "puntoycoma.png";
                }
                if (arreglo[i] == 'ú') {
                    ect = "uu.png";
                }
                if (arreglo[i] == 'ü') {
                    ect = "ud.png";
                }
                Image im = Image.getInstance(url + ect);
                im.setAbsolutePosition(x, y);
                doc.add(im);
                if (arreglo[i] == ' ') {
                    y = y - 90;
                    x = 25;
                } else {
                    x = x + 50;
                }
            }

            doc.close();
        } catch (DocumentException | IOException ss) {
            Logger.getLogger(TraBraile.class.getName()).log(Level.SEVERE, null, ss);
        }
    }
}
