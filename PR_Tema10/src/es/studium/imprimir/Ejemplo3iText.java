package es.studium.imprimir;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;


public class Ejemplo3iText {

	public static final String DEST = "QuickBrownFox.pdf";
	public static final String DOG = "dog.bmp";
	public static final String FOX = "fox.bmp";
	public static void main(String[] args)

	{
		new Ejemplo3iText(DEST);
	}
	public Ejemplo3iText(String dest)
	{
		try
		{
			//Initialize PDF writer
			PdfWriter writer = new PdfWriter(dest);
			//Initialize PDF document
			PdfDocument pdf = new PdfDocument(writer);
			// Initialize document
			Document document = new Document(pdf);
			// Compose Paragraph
			Image fox = new Image(ImageDataFactory.create(FOX));
			Image dog = new Image(ImageDataFactory.create(DOG));
			Paragraph p = new Paragraph("The quick brown ")
					.add(fox)
					.add(" jumps over the lazy ")
					.add(dog);
			// Add Paragraph to document
			document.add(p);
			//Close document
			document.close();
			// Open the new PDF document just created
			Desktop.getDesktop().open(new File(DEST));
		}
		catch(IOException ioe) {}
	}
}

