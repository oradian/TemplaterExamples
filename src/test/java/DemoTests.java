import hr.ngs.templater.TemplaterJson;
import hr.ngs.templater.example.*;
import org.junit.Test;

import java.awt.*;
import java.io.*;

public class DemoTests {

    static {
        //make sure some custom xml parser is not used
        System.setProperty("templater:DocumentBuilderFactory", "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
    }

    @Test
    public void testSimpleWord() throws Exception {
        SimpleWordExample.main(null);
    }

    @Test
    public void testSimpleExcel() throws Exception {
        SimpleExcelExample.main(null);
    }

    private InputStream resource(String name) throws FileNotFoundException {
        InputStream fromResource = DemoTests.class.getResourceAsStream(name);
        if (fromResource != null) return fromResource;
        //IDEA changed behavior in new versions and will not load resource from a pom project ;(
        return new FileInputStream(new File("src/test/resources" + name));
    }

    @Test
    public void testJsonBench() throws Exception {
        InputStream json = resource("/benchmark-data.json");
        InputStream template = resource("/benchmark-template.xlsx");
        File tmp = File.createTempFile("bench", ".xlsx");
        OutputStream output = new FileOutputStream(tmp);
        TemplaterJson.process("xlsx", template, json, output);
        Desktop.getDesktop().open(tmp);
    }

    @Test
    public void testJsonBeer() throws Exception {
        InputStream json = resource("/beers-data.json");
        InputStream template = resource("/beers-template.docx");
        File tmp = File.createTempFile("beers", ".docx");
        OutputStream output = new FileOutputStream(tmp);
        TemplaterJson.process("docx", template, json, output);
        Desktop.getDesktop().open(tmp);
    }

    @Test
    public void testMapResize() throws Exception {
        MapExample.main(null);
    }

    @Test
    public void testList() throws Exception {
        ListExample.main(null);
    }

    @Test
    public void testImage() throws Exception {
        ImageExample.main(null);
    }

    @Test
    public void testCSV() throws Exception {
        CsvExample.main(null);
    }

    @Test
    public void testLabels() throws Exception {
        LabelsExample.main(null);
    }

    @Test
    public void testDynamicResize() throws Exception {
        DynamicResize.main(null);
    }

    @Test
    public void testNamedRange() throws Exception {
        NamedRangeExample.main(null);
    }

    @Test
    public void testMailMerge() throws Exception {
        MailMergeExample.main(null);
    }

    @Test
    public void testSpreadsheetGrouping() throws Exception {
        SpreadsheetGroupingExample.main(null);
    }

    @Test
    public void testFormulaConversion() throws Exception {
        FormulaConversionExample.main(null);
    }

    @Test
    public void testHtmlExcel() throws Exception {
        HtmlExcelExample.main(null);
    }

    @Test
    public void testHtmlWord() throws Exception {
        HtmlWordExample.main(null);
    }

    @Test
    public void testPushdown() throws Exception {
        TableExample.main(null);
    }

    @Test
    public void testExcelLinks() throws Exception {
        ExcelLinksExample.main(null);
    }

    @Test
    public void testWordLinks() throws Exception {
        WordLinksExample.main(null);
    }

    @Test
    public void testListsAndTables() throws Exception {
        ListsTablesExample.main(null);
    }

    @Test
    public void testPivot() throws Exception {
        PivotExample.main(null);
    }

    @Test
    public void testCollapse() throws Exception {
        CollapseExample.main(null);
    }

    @Test
    public void testExcelRules() throws Exception {
        ExcelContextRulesExample.main(null);
    }

    @Test
    public void testOverride() throws Exception {
        BoolExample.main(null);
    }

    @Test
    public void testFields() throws Exception {
        FieldsExample.main(null);
    }

    @Test
    public void testMissing() throws Exception {
        MissingPropertyExample.main(null);
    }

    @Test
    public void testShared() throws Exception {
        SharedCollectionExample.main(null);
    }

    @Test
    public void testWordChart() throws Exception {
        WordChartExample.main(null);
    }

    @Test
    public void testQuestionnaire() throws Exception {
        QuestionnaireExample.main(null);
    }

    @Test
    public void testImport() throws Exception {
        ImportExample.main(null);
    }

    @Test
    public void testLimits() throws Exception {
        LimitsExample.main(null);
    }

    @Test
    public void testFormulas() throws Exception {
        FormulaExample.main(null);
    }

    @Test
    public void testPictures() throws Exception {
        PicturesExample.main(null);
    }

    @Test
    public void testTables() throws Exception {
        WordTablesExample.main(null);
    }

    @Test
    public void testResultSet() throws Exception {
        ResultSetExample.main(null);
    }

    @Test
    public void testDoubleProcessing() throws Exception {
        DoubleProcessingExample.main(null);
    }

    @Test
    public void testSheets() throws Exception {
        SheetReportExample.main(null);
    }


    @Test
    public void testCsvStreaming() throws Exception {
        CsvStreamingExample.main(null);
    }

    @Test
    public void testDepartments() throws Exception {
        DepartmentReportExample.main(null);
    }

    @Test
    public void testBinding() throws Exception {
        XmlBindingExample.main(null);
    }

    @Test
    public void testPowerQuery() throws Exception {
        //PowerQueryExample.main(null);//requires valid license file to work properly
    }

}
