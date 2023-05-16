package es.studium.imprimir;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;


public class Ejemplo2iText {

	public static final String DEST = "RickAstley.pdf";
	public static void main(String[] args)
	{
		new Ejemplo2iText(DEST);
	}
	public Ejemplo2iText(String dest)
	{
		try
		{
			//Initialize PDF writer
			PdfWriter writer = new PdfWriter(dest);
			//Initialize PDF document
			PdfDocument pdf = new PdfDocument(writer);
			// Initialize document
			Document document = new Document(pdf);
			// Create a PdfFont
			PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
			// Add a Paragraph
			document.add(new Paragraph("iText is:").setFont(font));
			// Create a List
			List list = new List()
					.setSymbolIndent(12)
					.setListSymbol("\u2022")
					.setFont(font);
			// Add ListItem objects
			list.add(new ListItem("Never gonna give you up"))
			.add(new ListItem("Never gonna let you down"))
			.add(new ListItem("Never gonna run around and desert you"))
			.add(new ListItem("Never gonna make you cry"))
			.add(new ListItem("Never gonna say goodbye"))
			.add(new ListItem("Never gonna tell a lie and hurt you"));
			// Add the list
			document.add(list);
			//Close document
			document.close();
			// Open the new PDF document just created
			Desktop.getDesktop().open(new File(DEST));
		}
		catch(IOException ioe) {}
	}
}
