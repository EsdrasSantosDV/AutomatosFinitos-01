/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author natha Essa classe contém os métodos que correspondem aos autômatos de
 * cada exercício. O método recebe uma String, e retorna uma variável do tipo
 * "Resposta"
 */

public final class Automatos {
    
    //Exercicio A =============================================================
    public Resposta exercicio_a(String cadeia) {
        
        String alfabeto = "ab";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        
       
        String texto1 = "                    EXERCICIO A\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case 'a'-> 1;
                        default -> 3;
                    };
                    case 1 -> estado = switch(c){
                        case 'a'-> 1;
                        default -> 2;
                    };
                    case 2 -> estado = switch(c){
                      case 'a'-> 1;
                        default -> 2;
                    };
                    case 3 -> estado = 3;
                   
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        if (!erro && estado==2){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;

      
    }

    //Exercicio B =============================================================
    public Resposta exercicio_b(String cadeia) {
        String alfabeto = "ab";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        
        String texto1 = "                    EXERCICIO B\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case 'a'-> 1;
                        default -> 0;
                    };
                    case 1 -> estado = switch(c){
                        case 'a'-> 2;
                        default -> 0;
                    };
                    case 2 -> estado = switch(c){
                      case 'a'-> 3;
                        default -> 0;
                    };
                    case 3 -> estado = 3;
                   
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        if (!erro && estado==3){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }
    
    
    

    //Exercicio C ==============================================================
    public Resposta exercicio_c(String cadeia) {
        String alfabeto = "ab";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        
        String texto1 = "                    EXERCICIO C\n\nSENTENÇA:" + cadeia + "\n\n";
         String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case 'a'-> 8;
                        default -> 1;
                    };
                    case 1 -> estado = switch(c){
                        case 'a'-> 2;
                        default -> 8;
                    };
                    case 2 -> estado = switch(c){
                      case 'a'-> 8;
                        default -> 3;
                    };
                     case 3 -> estado = switch(c){
                      case 'a'-> 4;
                        default -> 8;
                    };
                     case 4 -> estado = switch(c){
                      case 'a'-> 4;
                        default -> 5;
                    };
                     case 5 -> estado = switch(c){
                      case 'a'-> 6;
                        default -> 4;
                    };
                    case 6 -> estado = switch(c){
                      case 'a'-> 4;
                        default -> 7;
                    };
                    case 7-> estado = switch(c){
                      case 'a'-> 6;
                        default -> 5;
                    };
                    case 8->estado =8;
                   
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        
        if (!erro && estado==7){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
        
    }

    //Exercicio D ==============================================================
    public Resposta exercicio_d(String cadeia) {
        String alfabeto = "ab";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        String texto1 = "                    EXERCICIO D\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case 'a'-> 0;
                        default -> 1;
                    };
                    case 1 -> estado = switch(c){
                        case 'a'-> 2;
                        default -> 0;
                    };
                    case 2 -> estado = switch(c){
                      case 'a'-> 0;
                        default -> 3;
                    };
                     case 3 -> estado = switch(c){
                      case 'a'-> 4;
                        default -> 0;
                    };
                     case 4 -> estado = switch(c){
                      case 'a'-> 4;
                        default -> 5;
                    };
                    case 5 -> estado = switch(c){
                      case 'a'-> 6;
                        default -> 4;
                    }; 
                    case 6 -> estado = switch(c){
                      case 'a'-> 4;
                        default -> 7;
                    };
                     case 7 -> estado = switch(c){
                      case 'a'-> 8;
                        default -> 4;
                    };
                    case 8 -> estado = 8;
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        
        if (!erro && (estado==0||estado==1||estado==2||estado==3||estado==4||estado==5||estado==6||estado==7)){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }

    
    //Exercicio E ==============================================================
    public Resposta exercicio_e(String cadeia) {
        String alfabeto = "ab";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        String texto1 = "                    EXERCICIO E\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case 'a'-> 0;
                        default -> 1;
                    };
                    case 1 -> estado = switch(c){
                        case 'a'-> 2;
                        default -> 1;
                    };
                    case 2 -> estado = switch(c){
                      case 'a'-> 1;
                        default -> 3;
                    };
                     case 3 -> estado = switch(c){
                      case 'a'-> 4;
                        default -> 1;
                    };
                    case 4 -> estado = 4;
    
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        
        if (!erro && (estado==0||estado==1||estado==2||estado==3)){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }
     //Exercicio F ==============================================================
    public Resposta exercicio_f(String cadeia) {
        String alfabeto = "ab";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        String texto1 = "                    EXERCICIO F\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case 'a'-> 3;
                        default -> 1;
                    };
                    case 1 -> estado = switch(c){
                        case 'a'-> 2;
                        default -> 3;
                    };
                    case 2 -> estado = switch(c){
                      case 'a'-> 3;
                        default -> 1;
                    };
                    case 3 -> estado =3;
                   
                   
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        
        if (!erro && (estado==1||estado==2)){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }

   
    
   
    //Exercicio G
    public Resposta exercicio_g(String cadeia){
        String alfabeto = "qwertyuiopasdfghjklzxcvbnm";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        String texto1 = "                    EXERCICIO G\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch (c) {
                        case 'a' -> 1;
                        case 'b' -> 4;
                        default -> 6;
                    };
                    case 1 -> estado = switch(c){
                        case 'a' -> 2;
                        default -> 6;
                    };
                    case 2 -> estado = switch(c){
                        case 'a' -> 6;
                        default -> 3;
                    };
                    case 3 -> estado = switch(c){
                        case 'a' -> 2;
                        default -> 6;
                    };
                    case 4 -> estado = switch(c){
                        case 'b' -> 6;
                        default -> 5;
                    };
                    case 5 -> estado = switch(c){
                        case 'b' -> 4;
                        default -> 6;
                    };
                    case 6 -> estado = 6;
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        if (!erro && !(estado == 0 || estado == 6)) {
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }
    
    //Exercicio H
    public Resposta exercicio_h(String cadeia){
        String alfabeto = "0123456789";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        String texto1 = "                    EXERCICIO H\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case '0', '1' -> 1;
                        default -> 3;
                    };
                    case 1 -> estado = switch(c){
                        case '1', '3', '5', '7', '9' -> 2;
                        default -> 1;
                    };
                    case 2 -> estado = switch(c){
                        case '1', '3', '5', '7', '9' -> 1;
                        default -> 2;
                    };
                    case 3 -> estado = 3;
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        if (!erro && estado == 1) {
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }
    
    //Exercicio I
    public Resposta exercicio_i(String cadeia) {
        String alfabeto = "qwertyuiopasdfghjklzxcvbnm0123456789";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        
        String texto1 = "                    EXERCICIO I\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case '0','1','2', '3','4', '5','6', '7','8', '9'-> 2;
                        default -> 1;
                    };
                    case 1 -> estado = 1;
                    case 2 -> estado = 2;
                   
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        if (!erro && estado==1){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }
    
    
    

    //Exercicio J
    public Resposta exercicio_j(String cadeia){
        String alfabeto = "0123456789+-e,";
        boolean erro = false;
        int estado = 0;
        int pos = 0;
        String texto1 = "                    EXERCICIO J\n\nSENTENÇA:" + cadeia + "\n\n";
        String texto2 = "";
        char c = '#';
        do{
            c = cadeia.charAt(pos);
            if(alfabeto.indexOf(c) != -1){
                texto2 = "q" + estado + "->";
                switch(estado){
                    case 0 -> estado = switch(c){
                        case 'e',',' -> 8;
                        case '+','-' -> 2;
                        default -> 1;
                    };
                    case 1 -> estado = switch(c){
                        case ',' -> 3;
                        default -> 8;
                    };
                    case 2 -> estado = switch(c){
                        case '+','-','e',',' -> 8;
                        default -> 1;
                    };
                    case 3 -> estado = switch(c){
                        case '+','-',',','e' -> 8;
                        default -> 4;
                    };
                    case 4 -> estado = switch(c){
                        case 'e' -> 5;
                        case '+','-',',' -> 8;
                        default -> 4;
                    };
                    case 5 -> estado = switch(c){
                        case 'e',',' -> 5;
                        case '+','-' -> 6;
                        default -> 7;
                    };
                    case 6 -> estado = switch(c){
                        case 'e','+','-',',' -> 8;
                        default -> 7;
                    };
                    case 7 -> estado = switch(c){
                        case 'e','+','-',',' -> 8;
                        default -> 7;
                    };
                    case 8 -> estado = 8;
                }
                texto2 = texto2 + "q" + estado + "\n";
            }
            else{
                erro = true;
                texto2 = "Erro: simbolo {"+c+"} não pertence ao alfabeto: {" + alfabeto + "}\n";
            }
            texto1 = texto1 + texto2;
            pos++;
        }while(pos < cadeia.length() && !erro);
        
        Resposta resposta = new Resposta("", false);
        if (!erro && (estado == 1 || estado == 4 || estado == 7)){
            texto1 = texto1 + "\nSentenca Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = true;
        } else {
            texto1 = texto1 + "\nSentenca não Reconhecida";
            resposta.textoResposta = texto1;
            resposta.cadeiaAceita = false;
        }
        return resposta;
    }
}
