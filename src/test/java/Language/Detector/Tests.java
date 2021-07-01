package Language.Detector;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {


  @Test
  public void punctuationTest(){
    LanguageDetector languageDetector = new LanguageDetector();
    String language = languageDetector.detectLanguage("habla?", true);//ते काम करतंय का?
    assertEquals("Spanish", language);
    System.out.println(language);
  }

  @Test
  public void allLanguagesFourteenWords(){

    LanguageDetector languageDetector = new LanguageDetector();
    String language = languageDetector.detectLanguage("Is dit die regte manier om huis toe te gaan? ek het so gedink", true);
    assertEquals("Afrikaans", language);

    language = languageDetector.detectLanguage("Kjo është mënyra e saktë për në shtëpi? Unë mendova kështu", true);
    assertEquals("Albanian", language);
//    assertEquals("Amharic", language);
//    assertEquals("Arabic", language);
//    assertEquals("Armenian", language);
//    assertEquals("Azerbaijani", language);
//    assertEquals("Bengali", language);
//    assertEquals("Basque", language);
//    assertEquals("Balarusian", language);
//    assertEquals("Bosnian", language);
//    assertEquals("Bulgarian", language);
//    assertEquals("Burmese", language);
//    assertEquals("Catalan, Valencian", language);
//    assertEquals("Cebuano", language);
//    assertEquals("Chichewa", language);
//    assertEquals("Chinese", language);
//    assertEquals("Corsican", language);
//    assertEquals("Czech", language);
//    assertEquals("Danish", language);
//    assertEquals("Dutch", language);
//    assertEquals("English", language);
//    assertEquals("Esperanto", language);
//    assertEquals("Estonian", language);
//    assertEquals("Filipino, Pilipino", language);
//    assertEquals("Finnish", language);
//    assertEquals("French", language);
//    assertEquals("Galician", language);
//    assertEquals("Georgian", language);
//    assertEquals("German", language);
//    assertEquals("Greek", language);
//    assertEquals("Gujarati", language);
//    assertEquals("Haitian Creole", language);
//    assertEquals("Hausa", language);
//    assertEquals("Hawaiian", language);
//    assertEquals("Hebrew", language);
//    assertEquals("Hindi", language);
//    assertEquals("Hmong", language);
//    assertEquals("Hungarian", language);
//    assertEquals("Icelandic", language);
//    assertEquals("Igbo", language);
//    assertEquals("Indonesian", language);
//    assertEquals("Irish", language);
//    assertEquals("Italian", language);
//    assertEquals("Japanese", language);
//    assertEquals("Javanese", language);
//    assertEquals("Kannada", language);
//    assertEquals("Kazakh", language);
//    assertEquals("Khmer", language);
//    assertEquals("Kinyarwanda", language);
//    assertEquals("Korean", language);
//    assertEquals("Kurdish", language);
//    assertEquals("Kyrgyz", language);
//    assertEquals("Lao", language);
//    assertEquals("Latin", language);
//    assertEquals("Latvian", language);
//    assertEquals("Lithuanian", language);
//    assertEquals("Luxembourgish", language);
//    assertEquals("Macedonian", language);
//    assertEquals("Malagasy", language);
//    assertEquals("Malay", language);
//    assertEquals("Malayalam", language);
//    assertEquals("Maltese", language);
//    assertEquals("Maori", language);
//    assertEquals("Marathi", language);
//    assertEquals("Mongolian", language);
//    assertEquals("Myanmar", language);
//    assertEquals("Nepali", language);
//    assertEquals("Norwegian", language);
//    assertEquals("Odia", language);
//    assertEquals("Pashto", language);
//    assertEquals("Persian", language);
//    assertEquals("Polish", language);
//    assertEquals("Portuguese", language);
//    assertEquals("Punjabi", language);
//    assertEquals("Romanian", language);
//    assertEquals("Russian", language);
//    assertEquals("Samoan", language);
//    assertEquals("Scottish Gaelic", language);
//    assertEquals("Serbian", language);
//    assertEquals("Sesotho", language);
//    assertEquals("Shona", language);
//    assertEquals("Sindhi", language);
//    assertEquals("Sinhala", language);
//    assertEquals("Slovak", language);
//    assertEquals("Slovenian", language);
//    assertEquals("Somali", language);
//    assertEquals("Spanish", language);
//    assertEquals("Sudanese", language);
//    assertEquals("Swahili", language);
//    assertEquals("Swedish", language);
//    assertEquals("Tajik", language);
//    assertEquals("Tamil", language);
//    assertEquals("Tatar", language);
//    assertEquals("Telugu", language);
//    assertEquals("Thai", language);
//    assertEquals("Turkish", language);
//    assertEquals("Turkmen", language);
//    assertEquals("Ukrainian", language);
//    assertEquals("Urdu", language);
//    assertEquals("Uyghur", language);
//    assertEquals("Uzbek", language);
//    assertEquals("Vietnamese", language);
//    assertEquals("Welsh", language);
//    assertEquals("Xhosa", language);
//    assertEquals("Yiddish", language);
//    assertEquals("Yoruba", language);
//    assertEquals("Zulu", language);
  }

  @Test
  public void keyLanguagesThreeWords(){

    LanguageDetector languageDetector = new LanguageDetector();
    String language = languageDetector.detectLanguage("Is dit die regte manier om huis toe te gaan? ek het so gedink", true);
    assertEquals("Afrikaans", language);

    language = languageDetector.detectLanguage("Kjo është mënyra e saktë për në shtëpi? Unë mendova kështu", true);
    assertEquals("Albanian", language);
//    assertEquals("Amharic", language);
//    assertEquals("Arabic", language);
//    assertEquals("Armenian", language);
//    assertEquals("Azerbaijani", language);
//    assertEquals("Bengali", language);
//    assertEquals("Basque", language);
//    assertEquals("Balarusian", language);
//    assertEquals("Bosnian", language);
//    assertEquals("Bulgarian", language);
//    assertEquals("Burmese", language);
//    assertEquals("Catalan, Valencian", language);
//    assertEquals("Cebuano", language);
//    assertEquals("Chichewa", language);
//    assertEquals("Chinese", language);
//    assertEquals("Corsican", language);
//    assertEquals("Czech", language);
//    assertEquals("Danish", language);
//    assertEquals("Dutch", language);
//    assertEquals("English", language);
//    assertEquals("Esperanto", language);
//    assertEquals("Estonian", language);
//    assertEquals("Filipino, Pilipino", language);
//    assertEquals("Finnish", language);
//    assertEquals("French", language);
//    assertEquals("Galician", language);
//    assertEquals("Georgian", language);
//    assertEquals("German", language);
//    assertEquals("Greek", language);
//    assertEquals("Gujarati", language);
//    assertEquals("Haitian Creole", language);
//    assertEquals("Hausa", language);
//    assertEquals("Hawaiian", language);
//    assertEquals("Hebrew", language);
//    assertEquals("Hindi", language);
//    assertEquals("Hmong", language);
//    assertEquals("Hungarian", language);
//    assertEquals("Icelandic", language);
//    assertEquals("Igbo", language);
//    assertEquals("Indonesian", language);
//    assertEquals("Irish", language);
//    assertEquals("Italian", language);
//    assertEquals("Japanese", language);
//    assertEquals("Javanese", language);
//    assertEquals("Kannada", language);
//    assertEquals("Kazakh", language);
//    assertEquals("Khmer", language);
//    assertEquals("Kinyarwanda", language);
//    assertEquals("Korean", language);
//    assertEquals("Kurdish", language);
//    assertEquals("Kyrgyz", language);
//    assertEquals("Lao", language);
//    assertEquals("Latin", language);
//    assertEquals("Latvian", language);
//    assertEquals("Lithuanian", language);
//    assertEquals("Luxembourgish", language);
//    assertEquals("Macedonian", language);
//    assertEquals("Malagasy", language);
//    assertEquals("Malay", language);
//    assertEquals("Malayalam", language);
//    assertEquals("Maltese", language);
//    assertEquals("Maori", language);
//    assertEquals("Marathi", language);
//    assertEquals("Mongolian", language);
//    assertEquals("Myanmar", language);
//    assertEquals("Nepali", language);
//    assertEquals("Norwegian", language);
//    assertEquals("Odia", language);
//    assertEquals("Pashto", language);
//    assertEquals("Persian", language);
//    assertEquals("Polish", language);
//    assertEquals("Portuguese", language);
//    assertEquals("Punjabi", language);
//    assertEquals("Romanian", language);
//    assertEquals("Russian", language);
//    assertEquals("Samoan", language);
//    assertEquals("Scottish Gaelic", language);
//    assertEquals("Serbian", language);
//    assertEquals("Sesotho", language);
//    assertEquals("Shona", language);
//    assertEquals("Sindhi", language);
//    assertEquals("Sinhala", language);
//    assertEquals("Slovak", language);
//    assertEquals("Slovenian", language);
//    assertEquals("Somali", language);
//    assertEquals("Spanish", language);
//    assertEquals("Sudanese", language);
//    assertEquals("Swahili", language);
//    assertEquals("Swedish", language);
//    assertEquals("Tajik", language);
//    assertEquals("Tamil", language);
//    assertEquals("Tatar", language);
//    assertEquals("Telugu", language);
//    assertEquals("Thai", language);
//    assertEquals("Turkish", language);
//    assertEquals("Turkmen", language);
//    assertEquals("Ukrainian", language);
//    assertEquals("Urdu", language);
//    assertEquals("Uyghur", language);
//    assertEquals("Uzbek", language);
//    assertEquals("Vietnamese", language);
//    assertEquals("Welsh", language);
//    assertEquals("Xhosa", language);
//    assertEquals("Yiddish", language);
//    assertEquals("Yoruba", language);
//    assertEquals("Zulu", language);
  }

}
