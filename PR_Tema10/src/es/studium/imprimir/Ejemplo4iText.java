package es.studium.imprimir;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.awt.Desktop;
import java.io.File;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;

public class Ejemplo4iText {

	public static final String DATA = "united_states.csv";
	public static final String DEST = "EEUU.pdf";
	public static void main(String[] args)
	{
		new Ejemplo4iText(DEST);
	}
	public Ejemplo4iText(String dest)
	{
		try
		{
			//Initialize PDF writer
			PdfWriter writer = new PdfWriter(dest);
			//Initialize PDF document
			PdfDocument pdf = new PdfDocument(writer);
			// Initialize document
			Document document = new Document(pdf, PageSize.A4.rotate());
			document.setMargins(20, 20, 20, 20);
			PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
			PdfFont bold = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
			Table table = new Table(UnitValue.createPercentArray(new float[]{4, 1, 3, 4, 3, 3,
					3, 3, 1}))
					.useAllAvailableWidth();
			BufferedReader br = new BufferedReader(new FileReader(DATA));
			// Reading Headers
			String line = br.readLine();
			process(table, line, bold, true);
			// Reading rest of csv
			while ((line = br.readLine()) != null)
			{
				process(table, line, font, false);
			}
			br.close();
			document.add(table);
			//Close document
			document.close();
			// Open the new PDF document just created
			Desktop.getDesktop().open(new File(DEST));
		}
		catch(IOException ioe) {}
	}
	public void process(Table table, String line, PdfFont font, boolean isHeader)
	{
		StringTokenizer tokenizer = new StringTokenizer(line, ";");
		while (tokenizer.hasMoreTokens())
		{
			if (isHeader)
			{
				table.addHeaderCell(new Cell().add(new Paragraph(tokenizer.nextToken()).setFont(font)));
			}
			else
			{
				table.addCell(new Cell().add(new Paragraph(tokenizer.nextToken()).setFont(font)));
			}
		}
	}
}

