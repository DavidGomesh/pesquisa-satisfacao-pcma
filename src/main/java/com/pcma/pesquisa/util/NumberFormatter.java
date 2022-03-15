package com.pcma.pesquisa.util;

public class NumberFormatter {
    public static String getValueMaskFormat(String pMask, String pValue) {
        /*
         * Verifica se se foi configurado para nao retornar a
         * mascara se a string for nulo ou vazia se nao
         * retorna somente a mascara.
         */
        if (pValue == null || pValue.trim().equals(""))
            return "";

        /*
         * Substituir as mascaras passadas como 9 por # para efetuar a formatcao
         */
        pMask = pMask.replaceAll("9", "#");

        /*
         * Formata valor com a mascara passada
         */
        for (int i = 0; i < pValue.length(); i++) {
            pMask = pMask.replaceFirst("#", pValue.substring(i, i + 1));
        }

        /*
         * Subistitui por string vazia os digitos restantes da mascara
         * quando o valor passado é menor que a mascara
         */
        return pMask.replaceAll("#", "");
    }
}
