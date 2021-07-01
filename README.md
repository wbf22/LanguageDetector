# LanguageDetector

### Determines Language Out of 107 Common Languages


This library is free to use. 
It determines the language of text by 
comparing the input to a list of 
common words in the bank of languages
included in the project. Because of this,
it is much more likely to determine the
language correctly the longer the string
is. It was more a for fun project. 

If you'd like a more accurate detector, I 
would recommend using one of the following 
projects:
- https://github.com/pemistahl/lingua
- https://github.com/optimaize/language-detector

### Using the Detector

Include the jar file found [here](https://github.com/wbf22/LanguageDetector/tree/master/out/artifacts/LanguageDetector_jar)
Then include it in your project. For example:
in Intellij you would do this by going to File > 
Project Structure > Libraries > + > Java and then finding
the file on your computer. 

If you prefer, you're free to manually copy the files
as an alternative. 


### Example

All that is needed is to create a LanguageDetector object
and then call detectLanguage() passing in a string. 

```
LanguageDetector languageDetector = new LanguageDetector();
String language = languageDetector.detectLanguage("Que idioma es este frase?");
```

If you want the standard ISO 639 2/T code for the language call detectLanguage() like
this. See https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes
for more information.
```
LanguageDetector languageDetector = new LanguageDetector();
ISO2Code language = languageDetector.detectLanguage("Que idioma es este frase?", true);
```
An enum 'ISO2Code' is included in this jar. See it [here](https://github.com/wbf22/LanguageDetector/tree/master/src/main/java/Language/Detector)

### List of Supported Languages

- Afrikaans
- Albanian
- Amharic
- Arabic
- Armenian
- Azerbaijani
- Bengali
- Basque
- Balarusian
- Bosnian
- Bulgarian
- Burmese
- Catalan, Valencian
- Cebuano
- Chichewa
- Chinese
- Corsican
- Czech
- Danish
- Dutch
- English
- Esperanto
- Estonian
- Filipino, Pilipino
- Finnish
- French
- Galician
- Georgian
- German
- Greek
- Gujarati
- Haitian Creole
- Hausa
- Hawaiian
- Hebrew
- Hindi
- Hmong
- Hungarian
- Icelandic
- Igbo
- Indonesian
- Irish
- Italian
- Japanese
- Javanese
- Kannada
- Kazakh
- Khmer
- Kinyarwanda
- Korean
- Kurdish
- Kyrgyz
- Lao
- Latin
- Latvian
- Lithuanian
- Luxembourgish
- Macedonian
- Malagasy
- Malay
- Malayalam
- Maltese
- Maori
- Marathi
- Mongolian
- Myanmar
- Nepali
- Norwegian
- Odia
- Pashto
- Persian
- Polish
- Portuguese
- Punjabi
- Romanian
- Russian
- Samoan
- Scottish Gaelic
- Serbian
- Sesotho
- Shona
- Sindhi
- Sinhala
- Slovak
- Slovenian
- Somali
- Spanish
- Sudanese
- Swahili
- Swedish
- Tajik
- Tamil
- Tatar
- Telugu
- Thai
- Turkish
- Turkmen
- Ukrainian
- Urdu
- Uyghur
- Uzbek
- Vietnamese
- Welsh
- Xhosa
- Yiddish
- Yoruba
- Zulu






