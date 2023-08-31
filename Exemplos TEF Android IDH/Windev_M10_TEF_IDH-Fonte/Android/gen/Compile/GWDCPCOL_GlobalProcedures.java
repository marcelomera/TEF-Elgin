/**
 * Code generated by WINDEV - DO NOT MODIFY!
 * WINDEV object: Collection
 * Android class: COL_GlobalProcedures
 * Version of wdjava64.dll: 28.0.464.1
 */


package com.mycompany.ilumination_park.wdgen;


import com.mycompany.ilumination_park.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.erreur.*;
/*Imports trouvés dans le code WL*/
import android.view.View;
import android.view.Window;
import android.app.Activity;
import com.elgin.e1.Impressora.Termica;
import com.elgin.e1.Impressora.Termica;
import android.content.ActivityNotFoundException;
import android.app.Activity;
import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.app.Activity;
import android.content.Intent;
import com.elgin.e1.Impressora.Termica;
import android.content.ActivityNotFoundException;
import android.app.Activity;
import android.content.Intent;
import com.elgin.e1.Impressora.Termica;
import com.elgin.e1.Impressora.Termica;
import com.elgin.e1.Impressora.Termica;
import com.elgin.e1.Impressora.Termica;
import com.elgin.e1.Impressora.Termica;
import com.elgin.e1.Impressora.Termica;
import android.app.Activity;
import com.elgin.e1.Impressora.Termica;
/*Fin Imports trouvés dans le code WL*/



public class GWDCPCOL_GlobalProcedures extends WDCollProcAndroid
{

public WDProjet getProjet()
{
return GWDPIlumination_Park.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPIlumination_Park.getInstance();
}

protected String getNomCollection()
{
return "COL_GlobalProcedures";
}
private final static GWDCPCOL_GlobalProcedures ms_instance = new GWDCPCOL_GlobalProcedures();
public final static GWDCPCOL_GlobalProcedures getInstance()
{
return ms_instance;
}

// Code de déclaration de COL_GlobalProcedures
static public void init()
{
// 
ms_instance.initDeclarationCollection();



try
{

}
finally
{
finDeclarationCollection();

}
}




// Code de terminaison de COL_GlobalProcedures
static public void term()
{
// 
ms_instance.initTerminaisonCollection();



try
{

}
finally
{
finTerminaisonCollection();

}
}



// Nombre de Procédures : 19
public static int m10_Abre()
{
	Activity obj = getCurrentActivity(); 
	Termica.setContext(obj);
	int result = Termica.AbreConexaoImpressora(5,"","", 0);
	return result;
}
public static int m10_Imprime_Texto(String recebe_texto,int posicao,int estilo,int tamanho)
{
	int result = Termica.ImpressaoTexto(recebe_texto,posicao,estilo,tamanho);
	return result;	
}
public static int m10_Corte(int recebe_quantas_linhas)
{
	int result = Termica.Corte(recebe_quantas_linhas);
	return result;
}
public static int m10_Fecha()
{
	int result = Termica.FechaConexaoImpressora();
	return result;
}
public static int m10_AvancaPapel(int recebe_numero_linhas)
{
	int result = Termica.AvancaPapel(recebe_numero_linhas);
	return result;
}
public static int m10_ImpressaoQRCode(String recebe_qr)
{
	int result = Termica.ImpressaoQRCode(recebe_qr,4,1);
	return result;
}
public static int m10_ImprimeXMLNFCe(String receber_xml_conteudo, int id_csc,String csc,int parametro)
{
	int result = Termica.ImprimeXMLNFCe(receber_xml_conteudo,id_csc,csc,parametro);
	return result;
}
public static void TEF_Debito(String operador,String data,String hora,String numeroCupom,String valor,String CNPJ_CPF,String terminalSitef)
{
Activity act = getCurrentActivity();
Intent i = new Intent("com.elgin.e1.digitalhub.TEF");
i.putExtra("empresaSitef", "00000001");
i.putExtra("operador", operador);
i.putExtra("data", data);
i.putExtra("hora", hora);
i.putExtra("numeroCupom", numeroCupom);
i.putExtra("terminalSitef", terminalSitef);
i.putExtra("modalidade", "2");
i.putExtra("valor", valor);
i.putExtra("restricoes", "TransacoesHabilitadas=16");
i.putExtra("CNPJ_CPF", CNPJ_CPF); 
act.startActivityForResult(i, 3721);
}

static public WDObjet fWD_remove_acento( WDObjet vWD_texto )
{
// PROCEDURE remove_acento(texto)
ms_instance.initExecProcGlobale("remove_acento");



try
{

try
{
// texto	= NoAccent(texto)
vWD_texto.setValeur(WDAPIChaine.sansAccent(vWD_texto));

// texto	= Replace(texto,"xE1","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("C2189688AB5B25EB4D6FE9F09098EE8E004D30B6D51A5B41338C8C3C69053F7B")),new WDChaineA("a")));

// texto	= Replace(texto,"xE3","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("A13FC197DD03A02F45BA17038B5B1943763D932076484D9A71327A27DB9A357C")),new WDChaineA("a")));

// texto	= Replace(texto,"xEA","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("6E21A161C8B1FF78DD0313EED60DFD8795C40147E189DD449E45D136CFDD835B")),new WDChaineA("e")));

// texto	= Replace(texto,"xE9","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("182D50618EC394AC6133F1A3E9F7FADBD3F488592D321778668D385891F0D008")),new WDChaineA("e")));

// texto	= Replace(texto,"xED","i")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("F8F58E8E7BB1CC923C5FD4301A7933F4EA335EA0AA0547A31D12D388D85D5793")),new WDChaineA("i")));

// texto	= Replace(texto,"xF3","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("BA397C646217045F95904FB119F112C076594D2CAE4D5823458A1A9217A7C467")),new WDChaineA("o")));

// texto	= Replace(texto,"xF4","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("C194B374BAB555B9093180513A9E45A280A677623FCE734B6F6BAEFB0870FBC2")),new WDChaineA("o")));

// texto	= Replace(texto,"xFA","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("6FE421E37454108992ECE1FF8E223DC342F3AFBEA6C0F499BBE499DAE8BE10B7")),new WDChaineA("u")));

// texto	= Replace(texto,"xE7","c")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("1B43EDE7B89124708906F568976B115DDC50EEAABA95E2CE152E1B56BD6B69B8")),new WDChaineA("c")));

// texto	= Replace(texto,"xC1","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("75B9EA09ED2887882AA559FF6F377ED73B63DF8B071C9FB42FB0100E9533DB2F")),new WDChaineA("A")));

// texto	= Replace(texto,"xCD","I")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("2DA75B396F4FEB0656DBEB2407C92F06B5A08EA2E179A8A3A56547171A6EDF5A")),new WDChaineA("I")));

// texto	= Replace(texto,"r$"," R$ ")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("r$"),new WDChaineA(WDContexte.compact("D4F994481E2D1A2293E7F3AB8C5895E74FB91BFBFC6EBDBE552A34CD2579B934"))));

// texto	= Replace(texto,Charact(34),"")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,WDAPIChaine.caract(34),new WDChaineA("")));

// ChangeCharset(charsetOccidental)// SEM ACENTO
WDAPIVM.changeAlphabet(0);

// texto	= Replace(texto,"A£","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("A£"),new WDChaineA("a")));

// texto	= Replace(texto,"Ã£","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã£"),new WDChaineA("a")));

// texto	= Replace(texto,"£","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("£"),new WDChaineA("")));

// texto	= Replace(texto,"Ã¡","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã¡"),new WDChaineA("a")));

// texto	= Replace(texto,"Ã©","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã©"),new WDChaineA("e")));

// texto	= Replace(texto,"Ã­","i")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã­"),new WDChaineA("i")));

// texto	= Replace(texto,"Ã³","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã³"),new WDChaineA("o")));

// texto	= Replace(texto,"Ãº","u")//
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ãº"),new WDChaineA("u")));

// texto	= Replace(texto,"Ã","A")//Á
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã"),new WDChaineA("A")));

// texto	= Replace(texto,"A","A")//Á
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("A"),new WDChaineA("A")));

// texto	= Replace(texto,"Ã‰","E")//É
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã‰"),new WDChaineA("E")));

// texto	= Replace(texto,"Ã","I")//Í
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã"),new WDChaineA("I")));

// texto	= Replace(texto,"Ã“","O")//Ó
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã“"),new WDChaineA("O")));

// texto	= Replace(texto,"Ãš","U")//Ú
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ãš"),new WDChaineA("U")));

// texto	= Replace(texto,"Ã‚","A")// Â
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã‚"),new WDChaineA("A")));

// texto	= Replace(texto,"Ã”","O")// Ô
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã”"),new WDChaineA("O")));

// texto	= Replace(texto,"A•","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("A•"),new WDChaineA("O")));

// texto	= Replace(texto,"Ã•","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã•"),new WDChaineA("O")));

// texto	= Replace(texto,"¡","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("¡"),new WDChaineA("")));

// texto	= Replace(texto,"Ã¢","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã¢"),new WDChaineA("a")));

// texto	= Replace(texto,"¢","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("¢"),new WDChaineA("")));

// texto	= Replace(texto,"Ãµ","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ãµ"),new WDChaineA("o")));

// texto	= Replace(texto,"µ","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("µ"),new WDChaineA("O")));

// texto	= Replace(texto,"Áº","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Áº"),new WDChaineA("u")));

// texto	= Replace(texto,"Aº","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Aº"),new WDChaineA("u")));

// texto	= Replace(texto,"º","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("º"),new WDChaineA("u")));

// texto	= Replace(texto,"Ãƒ","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ãƒ"),new WDChaineA("A")));

// texto	= Replace(texto,"ƒ","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ƒ"),new WDChaineA("")));

// texto	= Replace(texto,"ÃŠ","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ÃŠ"),new WDChaineA("E")));

// texto	= Replace(texto,"©","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("©"),new WDChaineA("")));

// texto	= Replace(texto,"Ãª","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ãª"),new WDChaineA("e")));

// texto	= Replace(texto,"ª","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ª"),new WDChaineA("")));

// texto	= Replace(texto,"Ã´","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã´"),new WDChaineA("o")));

// texto	= Replace(texto,"´","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("´"),new WDChaineA("")));

// texto	= Replace(texto,"Aµ","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Aµ"),new WDChaineA("O")));

// texto	= Replace(texto,"µ","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("µ"),new WDChaineA("")));

// texto	= Replace(texto,"Ã³","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã³"),new WDChaineA("O")));

// texto	= Replace(texto,"³","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("³"),new WDChaineA("")));

// texto	= Replace(texto,"A“","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("A“"),new WDChaineA("O")));

// texto	= Replace(texto,"“","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("“"),new WDChaineA("")));

// texto	= Replace(texto,"Aº","U")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Aº"),new WDChaineA("U")));

// texto	= Replace(texto,"º","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("º"),new WDChaineA("")));

// texto	= Replace(texto,"Ã§","c")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã§"),new WDChaineA("c")));

// texto	= Replace(texto,"§","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("§"),new WDChaineA("")));

// texto	= Replace(texto,"Ã‡","C")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã‡"),new WDChaineA("C")));

// texto	= Replace(texto,"‡","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("‡"),new WDChaineA("")));

// texto	= Replace(texto,"Ã£O","AO")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(WDContexte.compact("BD5A52E1A71CDF869013767519AADD664A60871472D77FB3062BFA1177E50FDC")),new WDChaineA("AO")));

// texto	= Replace(texto,"£","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("£"),new WDChaineA("")));

// texto	= Replace(texto,"Ã‰","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã‰"),new WDChaineA("E")));

// texto	= Replace(texto,"‰","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("‰"),new WDChaineA("")));

// texto	= Replace(texto,"Ã%","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã%"),new WDChaineA("E")));

// texto	= Replace(texto,"A£","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("A£"),new WDChaineA("a")));

// texto	= Replace(texto,"£","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("£"),new WDChaineA("")));

// texto	= Replace(texto,"","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA(""),new WDChaineA("")));

// texto	= Replace(texto,"¡","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("¡"),new WDChaineA("")));

// texto	= Replace(texto,"¢","")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("¢"),new WDChaineA("")));

// texto	= Replace(texto,"~a","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~a"),new WDChaineA("a")));

// texto	= Replace(texto,"ã","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ã"),new WDChaineA("a")));

// texto	= Replace(texto,"á","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("á"),new WDChaineA("a")));

// texto	= Replace(texto,"à","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("à"),new WDChaineA("a")));

// texto	= Replace(texto,"â","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("â"),new WDChaineA("a")));

// texto	= Replace(texto,"ä","a")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ä"),new WDChaineA("a")));

// texto	= Replace(texto,"~e","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~e"),new WDChaineA("e")));

// texto	= Replace(texto,"é","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("é"),new WDChaineA("e")));

// texto	= Replace(texto,"è","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("è"),new WDChaineA("e")));

// texto	= Replace(texto,"ê","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ê"),new WDChaineA("e")));

// texto	= Replace(texto,"ë","e")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ë"),new WDChaineA("e")));

// texto	= Replace(texto,"~i","i")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~i"),new WDChaineA("i")));

// texto	= Replace(texto,"í","i")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("í"),new WDChaineA("i")));

// texto	= Replace(texto,"ì","i")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ì"),new WDChaineA("i")));

// texto	= Replace(texto,"î","i")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("î"),new WDChaineA("i")));

// texto	= Replace(texto,"ï","i")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ï"),new WDChaineA("i")));

// texto	= Replace(texto,"~o","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~o"),new WDChaineA("o")));

// texto	= Replace(texto,"õ","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("õ"),new WDChaineA("o")));

// texto	= Replace(texto,"ó","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ó"),new WDChaineA("o")));

// texto	= Replace(texto,"ò","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ò"),new WDChaineA("o")));

// texto	= Replace(texto,"ô","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ô"),new WDChaineA("o")));

// texto	= Replace(texto,"ö","o")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ö"),new WDChaineA("o")));

// texto	= Replace(texto,"~u","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~u"),new WDChaineA("u")));

// texto	= Replace(texto,"ú","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ú"),new WDChaineA("u")));

// texto	= Replace(texto,"ù","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ù"),new WDChaineA("u")));

// texto	= Replace(texto,"û","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("û"),new WDChaineA("u")));

// texto	= Replace(texto,"ü","u")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ü"),new WDChaineA("u")));

// texto	= Replace(texto,"ç","c")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("ç"),new WDChaineA("c")));

// texto	= Replace(texto,"Ç","C")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ç"),new WDChaineA("C")));

// texto	= Replace(texto,"~A","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~A"),new WDChaineA("A")));

// texto	= Replace(texto,"Ã","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ã"),new WDChaineA("A")));

// texto	= Replace(texto,"Á","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Á"),new WDChaineA("A")));

// texto	= Replace(texto,"À","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("À"),new WDChaineA("A")));

// texto	= Replace(texto,"Â","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Â"),new WDChaineA("A")));

// texto	= Replace(texto,"Ä","A")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ä"),new WDChaineA("A")));

// texto	= Replace(texto,"~E","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~E"),new WDChaineA("E")));

// texto	= Replace(texto,"É","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("É"),new WDChaineA("E")));

// texto	= Replace(texto,"È","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("È"),new WDChaineA("E")));

// texto	= Replace(texto,"Ê","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ê"),new WDChaineA("E")));

// texto	= Replace(texto,"Ë","E")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ë"),new WDChaineA("E")));

// texto	= Replace(texto,"~I","I")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~I"),new WDChaineA("I")));

// texto	= Replace(texto,"Í","I")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Í"),new WDChaineA("I")));

// texto	= Replace(texto,"Ì","I")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ì"),new WDChaineA("I")));

// texto	= Replace(texto,"Î","I")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Î"),new WDChaineA("I")));

// texto	= Replace(texto,"Ï","I")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ï"),new WDChaineA("I")));

// texto	= Replace(texto,"~O","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~O"),new WDChaineA("O")));

// texto	= Replace(texto,"Õ","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Õ"),new WDChaineA("O")));

// texto	= Replace(texto,"Ó","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ó"),new WDChaineA("O")));

// texto	= Replace(texto,"Ò","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ò"),new WDChaineA("O")));

// texto	= Replace(texto,"Ô","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ô"),new WDChaineA("O")));

// texto	= Replace(texto,"Ö","O")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ö"),new WDChaineA("O")));

// texto	= Replace(texto,"~U","U")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("~U"),new WDChaineA("U")));

// texto	= Replace(texto,"Ú","U")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ú"),new WDChaineA("U")));

// texto	= Replace(texto,"Ù","U")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ù"),new WDChaineA("U")));

// texto	= Replace(texto,"Û","U")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Û"),new WDChaineA("U")));

// texto	= Replace(texto,"Ü","U")
vWD_texto.setValeur(WDAPIChaine.remplace(vWD_texto,new WDChaineA("Ü"),new WDChaineA("U")));

// RESULT(texto)
return vWD_texto;

}
catch(WDErreurNonFatale | WDException eCatch)
{
eCatch.catch_GEN();
return eCatch.getValeurRetour();
}
}
finally
{
finExecProcGlobale();

}
}


public static int m10_ImprimeXMLSAT(String receber_xml_conteudo,int parametro)
{
	int result = Termica.ImprimeXMLSAT(receber_xml_conteudo,parametro);
	return result;
}
public static void TEF_Credito(String operador,String data,String hora,String numeroCupom,String numParcelas,String valor,String CNPJ_CPF,String terminalSitef)
{
Activity act = getCurrentActivity();
Intent i = new Intent("com.elgin.e1.digitalhub.TEF");
i.putExtra("empresaSitef", "00000001");
i.putExtra("operador", operador);
i.putExtra("data", data);
i.putExtra("hora", hora);
i.putExtra("numeroCupom", numeroCupom);
i.putExtra("numParcelas", "1");
i.putExtra("terminalSitef", terminalSitef);
i.putExtra("funcao", "credito");
i.putExtra("financiamento", "1");
i.putExtra("valor", valor);
i.putExtra("restricoes", "TransacoesHabilitadas=26");
i.putExtra("CNPJ_CPF", CNPJ_CPF);
act.startActivityForResult(i, 8765);
}
public static void TEF_Pix(String terminalSitef,String valor)
{
Activity act = getCurrentActivity();
Intent i = new Intent("com.elgin.e1.digitalhub.TEF");
i.putExtra("terminalSitef", terminalSitef);
i.putExtra("modalidade", "pix");
i.putExtra("valor", valor);
act.startActivityForResult(i, 4321);
}
public static int m10_StatusImpressora(int statusimpressora)
{
	int result = Termica.StatusImpressora(statusimpressora);
	return result;
}

static public void fWD_m10_Imprimir_Ticket( WDObjet vWD_sProduto )
{
// procedure m10_Imprimir_Ticket(sProduto is string)
ms_instance.initExecProcGlobale("m10_Imprimir_Ticket");



try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_dtAtual = new WDChaineA();

WDObjet vWD_hrAtual = new WDChaineA();

WDObjet vWD_sTexto = new WDChaineA();

WDObjet vWD_quantidade_linhas = new WDEntier4();

WDObjet vWD_nQuantidade_linhas = new WDEntier4();



vWD_sProduto = WDParametre.traiterParametre(vWD_sProduto, 1, false, 19);



try
{
// dtAtual	is string	= DateToString(DateSys(),maskDateSystem)

vWD_dtAtual.setValeur(WDAPIDate.dateVersChaine(WDAPIDate.dateSys(),WDContexte.compact("4891C6097A23CDDF517F44895CB6F4D71E0791BBEBC02390B7A98F7F1C672EFF")));


// hrAtual	is string	= TimeToString(TimeSys(),"HH:MM")

vWD_hrAtual.setValeur(WDAPIDate.heureVersChaine(WDAPIDate.heureSys(),WDContexte.compact("E648B57BB2790D8110CF239232ABB57917E38D166C68243CBC805D7E45A0CCA2")));


// m10_Abre()
m10_Abre();

// sTexto is string =[

vWD_sTexto.setValeur(WDAPIChaine.chaineConstruit(new WDChaineU("-------------------------------\r\nIlumination Park\r\nDATA: %1\r\nHORÁRIO %2\r\nPlaza Avenida Shopping -Piso 1\r\n-------------------------------\r\nVALE 1 %3\r\n-------------------------------\r\nTicket não é documento fiscal\r\nOBRIGADO E VOLTE SEMPRE"), new String[] {vWD_dtAtual.getString(),vWD_hrAtual.getString(),vWD_sProduto.getString()} ).getString());


// sTexto=remove_acento(sTexto)
vWD_sTexto.setValeur(fWD_remove_acento(vWD_sTexto));

// m10_Imprime_Texto(sTexto,0,0,0)
m10_Imprime_Texto(vWD_sTexto.getString(),0,0,0);

// quantidade_linhas  is int = 1

vWD_quantidade_linhas.setValeur(1);


// m10_AvancaPapel(quantidade_linhas)
m10_AvancaPapel(vWD_quantidade_linhas.getInt());

// nQuantidade_linhas is int = 1

vWD_nQuantidade_linhas.setValeur(1);


// m10_Corte(nQuantidade_linhas)
m10_Corte(vWD_nQuantidade_linhas.getInt());

}
catch(WDErreurNonFatale | WDException eCatch)
{
eCatch.catch_GEN();
return;
}
}
finally
{
finExecProcGlobale();

}
}



static public void fWD_m10_Imprime_TEF( WDObjet vWD_sNSU , WDObjet vWD_sDOC , WDObjet vWD_sValor , WDObjet vWD_sPag )
{
// procedure m10_Imprime_TEF(sNSU is string,sDOC is string,sValor is string,sPag is string)
ms_instance.initExecProcGlobale("m10_Imprime_TEF");



try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_dtAtual = new WDChaineA();

WDObjet vWD_hrAtual = new WDChaineA();

WDObjet vWD_sFormaPag = new WDChaineA();

WDObjet vWD_sTexto = new WDChaineA();

WDObjet vWD_quantidade_linhas = new WDEntier4();

WDObjet vWD_nQuantidade_linhas = new WDEntier4();



vWD_sNSU = WDParametre.traiterParametre(vWD_sNSU, 1, false, 19);

vWD_sDOC = WDParametre.traiterParametre(vWD_sDOC, 2, false, 19);

vWD_sValor = WDParametre.traiterParametre(vWD_sValor, 3, false, 19);

vWD_sPag = WDParametre.traiterParametre(vWD_sPag, 4, false, 19);



try
{
// dtAtual	is string	= DateToString(DateSys(),maskDateSystem)

vWD_dtAtual.setValeur(WDAPIDate.dateVersChaine(WDAPIDate.dateSys(),WDContexte.compact("6315B49EF600BF5E8A86E97C4566BFCBEB064B40C7C60427E36646C4FDFCE5D0")));


// hrAtual	is string	= TimeToString(TimeSys(),"HH:MM:SS")

vWD_hrAtual.setValeur(WDAPIDate.heureVersChaine(WDAPIDate.heureSys(),WDContexte.compact("E88FA3C17CE86CF07F7897512FC16A616BA48A611E27A06BE2F3A73172CD9D35")));


// sFormaPag is string


// SWITCH sPag
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SWITCH sPag
WDObjet _WDExpSelon0 = vWD_sPag;
// SWITCH sPag
if(_WDExpSelon0.opEgal("CC", 0))
{
// 		sFormaPag = "CREDITO"
vWD_sFormaPag.setValeur(WDContexte.compact("19BAC7546A0B792146152836F75B07F6F1A0B33DB0093C201613C256E0B41625"));

}
// SWITCH sPag
else if(_WDExpSelon0.opEgal("CE", 0))
{
// 		sFormaPag = "DEBITO"
vWD_sFormaPag.setValeur(WDContexte.compact("D3A14C972D940BD026AF8E18C5F1FB515555B1B1C13B0C93A5B2AE05871CB4DA"));

}
// SWITCH sPag
else if(_WDExpSelon0.opEgal("PX", 0))
{
// 		sFormaPag = "PIX"
vWD_sFormaPag.setValeur(WDContexte.compact("76E2D3EFA34D030721F71FE0CBF4AF9B5AFA822377754AB37146527DD87B944E"));

}
// SWITCH sPag
else {
}

}

// m10_Abre()
m10_Abre();

// sTexto is string =[

vWD_sTexto.setValeur(WDAPIChaine.chaineConstruit(new WDChaineU("-------------------------------\r\n%1 - Via Cliente\r\n-\r\nCOMPRA %1 A VISTA\r\n-\r\nVALOR: R$ %2\r\nDATA: %3 HORA: %4\r\nCV: %5 DOC: %6\r\n-------------------------------"), new String[] {vWD_sFormaPag.getString(),vWD_sValor.getString(),vWD_dtAtual.getString(),vWD_hrAtual.getString(),vWD_sNSU.getString(),vWD_sDOC.getString()} ).getString());


// m10_Imprime_Texto(sTexto,0,0,0)
m10_Imprime_Texto(vWD_sTexto.getString(),0,0,0);

// quantidade_linhas  is int = 1

vWD_quantidade_linhas.setValeur(1);


// m10_AvancaPapel(quantidade_linhas)
m10_AvancaPapel(vWD_quantidade_linhas.getInt());

// nQuantidade_linhas is int = 1

vWD_nQuantidade_linhas.setValeur(1);


// m10_Corte(nQuantidade_linhas)
m10_Corte(vWD_nQuantidade_linhas.getInt());

}
catch(WDErreurNonFatale | WDException eCatch)
{
eCatch.catch_GEN();
return;
}
}
finally
{
finExecProcGlobale();

}
}



static public void fWD_m10_Imprimir_Ingresso( WDObjet vWD_sHorario , WDObjet vWD_sLocalidade , WDObjet vWD_sResponsavel , WDObjet vWD_nome_menor , WDObjet vWD_meia , WDObjet vWD_idade , WDObjet vWD_especial , WDObjet vWD_cid )
{
// procedure m10_Imprimir_Ingresso(sHorario is string,sLocalidade is string,sResponsavel is string,nome_menor is string,meia is string,idade is string,especial is string,cid is string)//jIngresso is json)
ms_instance.initExecProcGlobale("m10_Imprimir_Ingresso");



try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_dtAtual = new WDChaineA();

WDObjet vWD_sTexto = new WDChaineA();

WDObjet vWD_quantidade_linhas = new WDEntier4();

WDObjet vWD_nQuantidade_linhas = new WDEntier4();



vWD_sHorario = WDParametre.traiterParametre(vWD_sHorario, 1, false, 19);

vWD_sLocalidade = WDParametre.traiterParametre(vWD_sLocalidade, 2, false, 19);

vWD_sResponsavel = WDParametre.traiterParametre(vWD_sResponsavel, 3, false, 19);

vWD_nome_menor = WDParametre.traiterParametre(vWD_nome_menor, 4, false, 19);

vWD_meia = WDParametre.traiterParametre(vWD_meia, 5, false, 19);

vWD_idade = WDParametre.traiterParametre(vWD_idade, 6, false, 19);

vWD_especial = WDParametre.traiterParametre(vWD_especial, 7, false, 19);

vWD_cid = WDParametre.traiterParametre(vWD_cid, 8, false, 19);



try
{
// dtAtual	is string	= DateToString(DateSys(),maskDateSystem)

vWD_dtAtual.setValeur(WDAPIDate.dateVersChaine(WDAPIDate.dateSys(),WDContexte.compact("3B7D445907F9AE9AF72FAF9E1548E79EED9C94A6C7C21F64F47EEC26702ADE81")));


// m10_Abre()
m10_Abre();

// sTexto is string =[

vWD_sTexto.setValeur(WDAPIChaine.chaineConstruit(new WDChaineU("-------------------------------\r\n           INGRESSO\r\nIlumination Park              \r\nDATA: %1             \r\n%2 \r\n%3\r\n-------------------------------\r\nResponsavel: \r\n%4\r\n-------------------------------\r\nNome: %5\r\nMeia: %6\r\nIdade: %7\r\nEspecial: %8\r\nCid: %9\r\n-------------------------------"), new String[] {vWD_dtAtual.getString(),vWD_sHorario.getString(),vWD_sLocalidade.getString(),vWD_sResponsavel.getString(),vWD_nome_menor.getString(),vWD_meia.getString(),vWD_idade.getString(),vWD_especial.getString(),vWD_cid.getString()} ).getString());


// sTexto=Replace(sTexto,CR," ")
vWD_sTexto.setValeur(WDAPIChaine.remplace(vWD_sTexto,new WDChaineA("\r\n"),new WDChaineA(" ")));

// sTexto=remove_acento(sTexto)
vWD_sTexto.setValeur(fWD_remove_acento(vWD_sTexto));

// sTexto=NoAccent(sTexto)
vWD_sTexto.setValeur(WDAPIChaine.sansAccent(vWD_sTexto));

// m10_Imprime_Texto(sTexto,0,0,0)
m10_Imprime_Texto(vWD_sTexto.getString(),0,0,0);

// quantidade_linhas  is int = 1

vWD_quantidade_linhas.setValeur(1);


// m10_AvancaPapel(quantidade_linhas)
m10_AvancaPapel(vWD_quantidade_linhas.getInt());

// nQuantidade_linhas is int = 1

vWD_nQuantidade_linhas.setValeur(1);


// m10_Corte(nQuantidade_linhas)
m10_Corte(vWD_nQuantidade_linhas.getInt());

}
catch(WDErreurNonFatale | WDException eCatch)
{
eCatch.catch_GEN();
return;
}
}
finally
{
finExecProcGlobale();

}
}


public static int m10_InicializaImpressora()
{
	int result = Termica.InicializaImpressora();
	return result;	
}

public static void Immersion() {
Activity xa = getCurrentActivity();
Window xw = xa.getWindow();
View decorView = xa.getWindow().getDecorView();
decorView.setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE );
}

static public void fWD_m10_Teste()
{
// procedure m10_Teste()
ms_instance.initExecProcGlobale("m10_Teste");



try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sTexto = new WDChaineA();

WDObjet vWD_quantidade_linhas = new WDEntier4();

WDObjet vWD_nQuantidade_linhas = new WDEntier4();




try
{
// m10_Abre()
m10_Abre();

// sTexto is string =[

vWD_sTexto.setValeur("-");


// m10_Imprime_Texto(sTexto,0,0,0)
m10_Imprime_Texto(vWD_sTexto.getString(),0,0,0);

// quantidade_linhas  is int = 1

vWD_quantidade_linhas.setValeur(1);


// m10_AvancaPapel(quantidade_linhas)
m10_AvancaPapel(vWD_quantidade_linhas.getInt());

// nQuantidade_linhas is int = 1

vWD_nQuantidade_linhas.setValeur(1);


// m10_Corte(nQuantidade_linhas)
m10_Corte(vWD_nQuantidade_linhas.getInt());

}
catch(WDErreurNonFatale | WDException eCatch)
{
eCatch.catch_GEN();
return;
}
}
finally
{
finExecProcGlobale();

}
}



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}