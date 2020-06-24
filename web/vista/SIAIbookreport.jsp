<%-- 
    Document   : SIAIbookreport
    Created on : Nov 19, 2019, 12:56:05 PM
    Author     : Johann Esneider
--%>

<%@page import="org.jfree.chart.ChartUtilities"%>
<%@page import="java.io.OutputStream"%>
<%@page import="org.jfree.chart.plot.PlotOrientation"%>
<%@page import="org.jfree.chart.ChartFactory"%>
<%@page import="org.jfree.chart.JFreeChart"%>
<%@page import="org.jfree.data.category.DefaultCategoryDataset"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reports Page</title>
        <script type="text/javascript">
$(document).ready(function(){
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
});
</script>
    </head>
    <body>
<%
//Conexión con la base de datos 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection cn=DriverManager.getConnection("jdbc:mysql://node41230-sena-adsi.jelastic.saveincloud.net:3306/siaibd1","root","BKQbaa47854");
        Statement cmd=cn.createStatement();
        String sql="SELECT nombrepdf, numCapitulos FROM pdfLibro ORDER BY numCapitulos";
        ResultSet rs=cmd.executeQuery(sql);
        //Instanciar obejeto que corresponde el tipo de grafico
        //Cargaremos la data para las series
        
        DefaultCategoryDataset data= new DefaultCategoryDataset();
        while(rs.next()){
        data.setValue(rs.getInt(2), "Número de Capitulos",rs.getString(1));
        }
        //Generar el grafico
        JFreeChart grafico=ChartFactory.createBarChart("Libros SIAI WEB", "Reporte Estadistico", "GAES 6", data, PlotOrientation.VERTICAL, true, true, true);
        

        //Definir el medio donde se visualizara el grafico
        response.setContentType("image/JPEG");
        OutputStream sa = response.getOutputStream();
        
        //Impresion del grafico
        ChartUtilities.writeChartAsJPEG(sa, grafico, 500, 500);
        

        //Crear el objeto para la impresion de los datos en formato PDF
%>
    </body>
</html>
