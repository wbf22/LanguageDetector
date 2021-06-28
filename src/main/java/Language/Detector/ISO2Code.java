package Language.Detector;

public enum ISO2Code{

  afr("Afrikaans"),
  alb("Albanian"),
  amh("Amharic"),
  ara("Arabic"),
  arm("Armenian"),
  aze("Azerbaijani"),
  ben("Bengali"),
  eus("Basque"),
  bel("Balarusian"),
  bos("Bosnian"),
  bul("Bulgarian"),
  bur("Burmese"),
  cat("Catalan; Valencian"),
  ceb("Cebuano"),
  nya("Chichewa"),
  chi("Chinese"),
  cos("Corsican"),
  ces("Czech"),
  dan("Danish"),
  nld("Dutch"),
  eng("English"),
  epo("Esperanto"),
  est("Estonian"),
  fil("Filipino; Pilipino"),
  fin("Finnish"),
  fre("French"),
  glg("Galician"),
  kat("Georgian"),
  deu("German"),
  ell("Greek"),
  guj("Gujarati"),
  hat("Haitian Creole"),
  hau("Hausa"),
  haw("Hawaiian"),
  heb("Hebrew"),
  hin("Hindi"),
  hmn("Hmong"),
  hun("Hungarian"),
  isl("Icelandic"),
  ibo("Igbo"),
  ind("Indonesian"),
  gle("Irish"),
  ita("Italian"),
  jpn("Japanese"),
  jav("Javanese"),
  kan("Kannada"),
  kaz("Kazakh"),
  khm("Khmer"),
  kin("Kinyarwanda"),
  kor("Korean"),
  kur("Kurdish"),
  kir("Kyrgyz"),
  lao("Lao"),
  lat("Latin"),
  lav("Latvian"),
  lit("Lithuanian"),
  ltz("Luxembourgish"),
  mkd("Macedonian"),
  mlg("Malagasy"),
  msa("Malay"),
  mal("Malayalam"),
  mlt("Maltese"),
  mri("Maori"),
  mar("Marathi"),
  mon("Mongolian"),
  nep("Nepali"),
  nor("Norwegian"),
  ori("Odia"),
  pus("Pashto"),
  fas("Persian"),
  pol("Polish"),
  por("Portuguese"),
  pan("Punjabi"),
  ron("Romanian"),
  rus("Russian"),
  smo("Samoan"),
  gla("Scottish Gaelic"),
  srp("Serbian"),
  sna("Shona"),
  snd("Sindhi"),
  sin("Sinhala"),
  slk("Slovak"),
  slv("Slovenian"),
  som("Somali"),
  sot("Southern Sotho"),
  spa("Spanish"),
  sun("Sudanese"),
  swa("Swahili"),
  swe("Swedish"),
  tgk("Tajik"),
  tam("Tamil"),
  tat("Tatar"),
  tel("Telugu"),
  tha("Thai"),
  tur("Turkish"),
  tuk("Turkmen"),
  ukr("Ukrainian"),
  urd("Urdu"),
  uig("Uyghur"),
  uzb("Uzbek"),
  vie("Vietnamese"),
  cym("Welsh"),
  fry("Western Frisian"),
  xho("Xhosa"),
  yid("Yiddish"),
  yor("Yoruba"),
  zul("Zulu");




  private String name;

  ISO2Code(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


}
