/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {

    public static final Scanner SCN = 
	  new Scanner(System.in, "Windows-1252")
	  .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        int hActual; //hora actual
        int mActual; //minuto actual
        int sActual; //segundo actual
        
        int hUsuario; //hora introducido por usuario
        int mUsuario; //minuto introducido por usuario
        int sUsuario; //segundo introducido por usuario
        
        int distHora; //resultado del calculo horas
        int distMinuto; //resultado del calculo minutos
        int distSegundo; // resultado del calculo segundo
               
        
        //Objeto gregorianscalendar
        Calendar cal = Calendar.getInstance();
        
        //Obtener valores    
        hActual = cal.get(Calendar.HOUR_OF_DAY);
        mActual = cal.get(Calendar.MINUTE);
        sActual = cal.get(Calendar.SECOND);
        
        System.out.print("Hora inicio.......: ");
        hUsuario  = SCN.nextInt();
        System.out.print("Minuto inicio.....: ");
        mUsuario  = SCN.nextInt();
        System.out.printf("Segundo inicio...: ");
        sUsuario  = SCN.nextInt();
        
        // Operaciones
        int segActuales = (hActual*60 + mActual)*60+sActual;
        int segUsuario = (hUsuario*60 + mUsuario)*60+sUsuario;
        
        int distanciaTotal = segActuales - segUsuario;
        
        distHora = distanciaTotal / 3600;
        distMinuto = (distanciaTotal / 60) % 60;
        distSegundo = distanciaTotal % 60;        
        
        // Salida
        System.out.printf("Hora actual......: %02d:%02d:%02d%n", hActual, mActual, sActual);
        System.out.printf("Hora inicio......: %02d:%02d:%02d%n", hUsuario, mUsuario, sUsuario);
        System.out.printf("Tiempo de clase..: %02d:%02d:%02d%n", distHora, distMinuto, distSegundo);
    }
}
        
        
        
        
    
