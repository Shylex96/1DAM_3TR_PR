package es.studium.imprimir;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class Ejemplo1iText {
	
	public static final String DEST = "HolaMundo.pdf";
	
	public static void main(String[] args)
	{
		new Ejemplo1iText(DEST);
	}
	
	public Ejemplo1iText(String dest)
	{
		try
		{
			//Initialize PDF writer
			PdfWriter writer = new PdfWriter(dest);
			//Initialize PDF document
			PdfDocument pdf = new PdfDocument(writer);
			// Initialize document
			Document document = new Document(pdf);
			//Add paragraph to the document
			document.add(new Paragraph("Hello World!"));
			//Close document
			document.close();
			// Open the new PDF document just created
			Desktop.getDesktop().open(new File(DEST));
		}
		catch(IOException ioe) {}
	}
}
