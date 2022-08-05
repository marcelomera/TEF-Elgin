unit FuncoesDLL;

interface

  function SetClientTCP(ip:PAnsiChar; porta:Integer):PAnsiChar;stdcall; external 'E1_Tef01.dll';

  function ConfigurarDadosPDV(textoPinpad:PAnsiChar; versaoAC:PAnsiChar; nomeEstabelecimento:PAnsiChar; loja:PAnsiChar; identificadorPontoCaptura:PAnsiChar):PAnsiChar; stdcall; external 'E1_Tef01.dll';

  function IniciarOperacaoTEF(dadosCaptura:PAnsiChar):PAnsiChar; stdcall; external 'E1_Tef01.dll';

  function RecuperarOperacaoTEF(dadosCaptura:PAnsiChar):PAnsiChar; stdcall; external 'E1_Tef01.dll';

  function RealizarPagamentoTEF(codigoOperacao:Integer; dadosCaptura:PAnsiChar; novaTransacao:Boolean):PAnsiChar;stdcall;external 'E1_Tef01.dll';

  function RealizarAdmTEF(codigoOperacao:Integer; dadosCaptura:PAnsiChar; novaTransacao:Boolean):PAnsiChar;stdcall;external 'E1_Tef01.dll';

  function ConfirmarOperacaoTEF(id:Integer; acao:Integer):PAnsiChar; stdcall; external 'E1_Tef01.dll';

  function FinalizarOperacaoTEF(id:Integer):PAnsiChar; stdcall; external 'E1_Tef01.dll';

implementation

end.