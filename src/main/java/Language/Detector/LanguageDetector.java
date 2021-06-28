package Language.Detector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class LanguageDetector {

  private Map<String, Integer> afr = new HashMap<>();
  private Map<String, Integer> alb = new HashMap<>();
  private Map<String, Integer> amh = new HashMap<>();
  private Map<String, Integer> ara = new HashMap<>();
  private Map<String, Integer> arm = new HashMap<>();
  private Map<String, Integer> aze = new HashMap<>();
  private Map<String, Integer> ben = new HashMap<>();
  private Map<String, Integer> eus = new HashMap<>();
  private Map<String, Integer> bel = new HashMap<>();
  private Map<String, Integer> bos = new HashMap<>();
  private Map<String, Integer> bul = new HashMap<>();
  private Map<String, Integer> bur = new HashMap<>();
  private Map<String, Integer> cat = new HashMap<>();
  private Map<String, Integer> ceb = new HashMap<>();
  private Map<String, Integer> chi = new HashMap<>();
  private Map<String, Integer> cos = new HashMap<>();
  private Map<String, Integer> ces = new HashMap<>();
  private Map<String, Integer> dan = new HashMap<>();
  private Map<String, Integer> eng = new HashMap<>();
  private Map<String, Integer> epo = new HashMap<>();
  private Map<String, Integer> est = new HashMap<>();
  private Map<String, Integer> fil = new HashMap<>();
  private Map<String, Integer> fin = new HashMap<>();
  private Map<String, Integer> fre = new HashMap<>();
  private Map<String, Integer> glg = new HashMap<>();
  private Map<String, Integer> kat = new HashMap<>();
  private Map<String, Integer> deu = new HashMap<>();
  private Map<String, Integer> ell = new HashMap<>();
  private Map<String, Integer> guj = new HashMap<>();
  private Map<String, Integer> hat = new HashMap<>();
  private Map<String, Integer> hau = new HashMap<>();
  private Map<String, Integer> haw = new HashMap<>();
  private Map<String, Integer> heb = new HashMap<>();
  private Map<String, Integer> hin = new HashMap<>();
  private Map<String, Integer> hmn = new HashMap<>();
  private Map<String, Integer> hun = new HashMap<>();
  private Map<String, Integer> isl = new HashMap<>();
  private Map<String, Integer> ibo = new HashMap<>();
  private Map<String, Integer> ind = new HashMap<>();
  private Map<String, Integer> gle = new HashMap<>();
  private Map<String, Integer> ita = new HashMap<>();
  private Map<String, Integer> jpn = new HashMap<>();
  private Map<String, Integer> jav = new HashMap<>();
  private Map<String, Integer> kan = new HashMap<>();
  private Map<String, Integer> kaz = new HashMap<>();
  private Map<String, Integer> khm = new HashMap<>();
  private Map<String, Integer> kin = new HashMap<>();
  private Map<String, Integer> kor = new HashMap<>();
  private Map<String, Integer> kur = new HashMap<>();
  private Map<String, Integer> kir = new HashMap<>();
  private Map<String, Integer> lao = new HashMap<>();
  private Map<String, Integer> lat = new HashMap<>();
  private Map<String, Integer> lav = new HashMap<>();
  private Map<String, Integer> lit = new HashMap<>();
  private Map<String, Integer> ltz = new HashMap<>();
  private Map<String, Integer> mkd = new HashMap<>();
  private Map<String, Integer> mlg = new HashMap<>();
  private Map<String, Integer> msa = new HashMap<>();
  private Map<String, Integer> mal = new HashMap<>();
  private Map<String, Integer> mlt = new HashMap<>();
  private Map<String, Integer> mri = new HashMap<>();
  private Map<String, Integer> mar = new HashMap<>();
  private Map<String, Integer> mon = new HashMap<>();
  private Map<String, Integer> nep = new HashMap<>();
  private Map<String, Integer> nor = new HashMap<>();
  private Map<String, Integer> nya = new HashMap<>();
  private Map<String, Integer> ori = new HashMap<>();
  private Map<String, Integer> pus = new HashMap<>();
  private Map<String, Integer> fas = new HashMap<>();
  private Map<String, Integer> pol = new HashMap<>();
  private Map<String, Integer> por = new HashMap<>();
  private Map<String, Integer> pan = new HashMap<>();
  private Map<String, Integer> ron = new HashMap<>();
  private Map<String, Integer> rus = new HashMap<>();
  private Map<String, Integer> smo = new HashMap<>();
  private Map<String, Integer> gla = new HashMap<>();
  private Map<String, Integer> srp = new HashMap<>();
  private Map<String, Integer> sna = new HashMap<>();
  private Map<String, Integer> snd = new HashMap<>();
  private Map<String, Integer> sin = new HashMap<>();
  private Map<String, Integer> slk = new HashMap<>();
  private Map<String, Integer> slv = new HashMap<>();
  private Map<String, Integer> som = new HashMap<>();
  private Map<String, Integer> sot = new HashMap<>();
  private Map<String, Integer> spa = new HashMap<>();
  private Map<String, Integer> sun = new HashMap<>();
  private Map<String, Integer> swa = new HashMap<>();
  private Map<String, Integer> swe = new HashMap<>();
  private Map<String, Integer> tgk = new HashMap<>();
  private Map<String, Integer> tam = new HashMap<>();
  private Map<String, Integer> tat = new HashMap<>();
  private Map<String, Integer> tel = new HashMap<>();
  private Map<String, Integer> tha = new HashMap<>();
  private Map<String, Integer> tur = new HashMap<>();
  private Map<String, Integer> tuk = new HashMap<>();
  private Map<String, Integer> ukr = new HashMap<>();
  private Map<String, Integer> urd = new HashMap<>();
  private Map<String, Integer> uig = new HashMap<>();
  private Map<String, Integer> uzb = new HashMap<>();
  private Map<String, Integer> vie = new HashMap<>();
  private Map<String, Integer> cym = new HashMap<>();
  private Map<String, Integer> fry = new HashMap<>();
  private Map<String, Integer> xho = new HashMap<>();
  private Map<String, Integer> yid = new HashMap<>();
  private Map<String, Integer> yor = new HashMap<>();
  private Map<String, Integer> zul = new HashMap<>();


  public String detectLanguage(String text, boolean englishName){
    if (englishName){
      return detectLanguage(text).getName();
    }
    return detectLanguage(text).toString();
  }

  public ISO2Code detectLanguage(String text) {
    long start = System.currentTimeMillis();
    try {
      indexLanguageFiles();
    }
    catch (FileNotFoundException e) { e.printStackTrace(); }


    StringTokenizer stringTokenizer = new StringTokenizer(text.toLowerCase());
    List<String> textWords = new ArrayList<>();
    while (stringTokenizer.hasMoreTokens()) textWords.add(stringTokenizer.nextToken());

    Map<ISO2Code, Integer> matches = new HashMap<>();
    for (String word : textWords) {
      if (afr.get(word) != null) { matches.put(ISO2Code.afr, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (alb.get(word) != null) { matches.put(ISO2Code.alb, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (amh.get(word) != null) { matches.put(ISO2Code.amh, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (ara.get(word) != null) { matches.put(ISO2Code.ara, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (arm.get(word) != null) { matches.put(ISO2Code.arm, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (aze.get(word) != null) { matches.put(ISO2Code.aze, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (bel.get(word) != null) { matches.put(ISO2Code.bel, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (ben.get(word) != null) { matches.put(ISO2Code.ben, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (bos.get(word) != null) { matches.put(ISO2Code.bos, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (bul.get(word) != null) { matches.put(ISO2Code.bul, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (bur.get(word) != null) { matches.put(ISO2Code.bur, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (cat.get(word) != null) { matches.put(ISO2Code.cat, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (ceb.get(word) != null) { matches.put(ISO2Code.ceb, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (chi.get(word) != null) { matches.put(ISO2Code.chi, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (eng.get(word) != null) { matches.put(ISO2Code.eng, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
      if (eus.get(word) != null) { matches.put(ISO2Code.eus, (matches.get(word) == null) ? 1 : matches.get(word).intValue() + 1); }
    }


    Map.Entry<ISO2Code, Integer> matchedLanguage = new AbstractMap.SimpleEntry<ISO2Code, Integer>(ISO2Code.eng, (matches.get(ISO2Code.eng) == null) ? 0 : matches.get(ISO2Code.eng));
    for (Map.Entry<ISO2Code, Integer> entry : matches.entrySet()) {
      if (entry.getValue() > matchedLanguage.getValue()) {
        matchedLanguage = entry;
      }
    }



    System.out.println(System.currentTimeMillis() - start);

    return matchedLanguage.getKey();
  }

  private void indexLanguageFiles() throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("src/main/resources/afr.txt"));
    while(scanner.hasNext()){ afr.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/alb.txt"));
    while(scanner.hasNext()){ alb.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/amh.txt"));
    while(scanner.hasNext()){ amh.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/ara.txt"));
    while(scanner.hasNext()){ ara.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/arm.txt"));
    while(scanner.hasNext()){ arm.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/aze.txt"));
    while(scanner.hasNext()){ aze.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/ben.txt"));
    while(scanner.hasNext()){ ben.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/eus.txt"));
    while(scanner.hasNext()){ eus.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/bel.txt"));
    while(scanner.hasNext()){ bel.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/bos.txt"));
    while(scanner.hasNext()){ bos.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/bul.txt"));
    while(scanner.hasNext()){ bul.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/bur.txt"));
    while(scanner.hasNext()){ bur.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/cat.txt"));
    while(scanner.hasNext()){ cat.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/ceb.txt"));
    while(scanner.hasNext()){ ceb.put(scanner.next(), 1); }

    scanner = new Scanner(new File("src/main/resources/chi.txt"));
    while(scanner.hasNext()){ chi.put(scanner.next(), 1); }

//    scanner = new Scanner(new File("src/main/resources/cos.txt"));
//    while(scanner.hasNext()){ cos.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ces.txt"));
//    while(scanner.hasNext()){ ces.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/dan.txt"));
//    while(scanner.hasNext()){ dan.put(scanner.next(), 1); }
//
    scanner = new Scanner(new File("src/main/resources/eng.txt"));
    while(scanner.hasNext()){ eng.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/epo.txt"));
//    while(scanner.hasNext()){ epo.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/est.txt"));
//    while(scanner.hasNext()){ est.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/fil.txt"));
//    while(scanner.hasNext()){ fil.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/fin.txt"));
//    while(scanner.hasNext()){ fin.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/fre.txt"));
//    while(scanner.hasNext()){ fre.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/glg.txt"));
//    while(scanner.hasNext()){ glg.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/kat.txt"));
//    while(scanner.hasNext()){ kat.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/deu.txt"));
//    while(scanner.hasNext()){ deu.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ell.txt"));
//    while(scanner.hasNext()){ ell.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/guj.txt"));
//    while(scanner.hasNext()){ guj.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/hat.txt"));
//    while(scanner.hasNext()){ hat.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/hau.txt"));
//    while(scanner.hasNext()){ hau.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/haw.txt"));
//    while(scanner.hasNext()){ haw.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/heb.txt"));
//    while(scanner.hasNext()){ heb.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/hin.txt"));
//    while(scanner.hasNext()){ hin.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/hmn.txt"));
//    while(scanner.hasNext()){ hmn.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/hun.txt"));
//    while(scanner.hasNext()){ hun.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/isl.txt"));
//    while(scanner.hasNext()){ isl.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ibo.txt"));
//    while(scanner.hasNext()){ ibo.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ind.txt"));
//    while(scanner.hasNext()){ ind.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/gle.txt"));
//    while(scanner.hasNext()){ gle.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ita.txt"));
//    while(scanner.hasNext()){ ita.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/jpn.txt"));
//    while(scanner.hasNext()){ jpn.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/jav.txt"));
//    while(scanner.hasNext()){ jav.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/kan.txt"));
//    while(scanner.hasNext()){ kan.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/kaz.txt"));
//    while(scanner.hasNext()){ kaz.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/khm.txt"));
//    while(scanner.hasNext()){ khm.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/kin.txt"));
//    while(scanner.hasNext()){ kin.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/kor.txt"));
//    while(scanner.hasNext()){ kor.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/kur.txt"));
//    while(scanner.hasNext()){ kur.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/kir.txt"));
//    while(scanner.hasNext()){ kir.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/lao.txt"));
//    while(scanner.hasNext()){ lao.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/lat.txt"));
//    while(scanner.hasNext()){ lat.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/lav.txt"));
//    while(scanner.hasNext()){ lav.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/lit.txt"));
//    while(scanner.hasNext()){ lit.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ltz.txt"));
//    while(scanner.hasNext()){ ltz.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/mkd.txt"));
//    while(scanner.hasNext()){ mkd.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/mlg.txt"));
//    while(scanner.hasNext()){ mlg.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/msa.txt"));
//    while(scanner.hasNext()){ msa.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/mal.txt"));
//    while(scanner.hasNext()){ mal.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/mlt.txt"));
//    while(scanner.hasNext()){ mlt.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/mri.txt"));
//    while(scanner.hasNext()){ mri.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/mar.txt"));
//    while(scanner.hasNext()){ mar.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/mon.txt"));
//    while(scanner.hasNext()){ mon.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/nep.txt"));
//    while(scanner.hasNext()){ nep.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/nor.txt"));
//    while(scanner.hasNext()){ nor.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/nya.txt"));
//    while(scanner.hasNext()){ nya.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ori.txt"));
//    while(scanner.hasNext()){ ori.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/pus.txt"));
//    while(scanner.hasNext()){ pus.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/fas.txt"));
//    while(scanner.hasNext()){ fas.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/pol.txt"));
//    while(scanner.hasNext()){ pol.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/por.txt"));
//    while(scanner.hasNext()){ por.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/pan.txt"));
//    while(scanner.hasNext()){ pan.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ron.txt"));
//    while(scanner.hasNext()){ ron.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/rus.txt"));
//    while(scanner.hasNext()){ rus.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/smo.txt"));
//    while(scanner.hasNext()){ smo.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/gla.txt"));
//    while(scanner.hasNext()){ gla.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/srp.txt"));
//    while(scanner.hasNext()){ srp.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/sna.txt"));
//    while(scanner.hasNext()){ sna.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/snd.txt"));
//    while(scanner.hasNext()){ snd.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/sin.txt"));
//    while(scanner.hasNext()){ sin.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/slk.txt"));
//    while(scanner.hasNext()){ slk.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/slv.txt"));
//    while(scanner.hasNext()){ slv.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/som.txt"));
//    while(scanner.hasNext()){ som.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/sot.txt"));
//    while(scanner.hasNext()){ sot.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/spa.txt"));
//    while(scanner.hasNext()){ spa.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/sun.txt"));
//    while(scanner.hasNext()){ sun.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/swa.txt"));
//    while(scanner.hasNext()){ swa.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/swe.txt"));
//    while(scanner.hasNext()){ swe.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/tgk.txt"));
//    while(scanner.hasNext()){ tgk.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/tam.txt"));
//    while(scanner.hasNext()){ tam.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/tat.txt"));
//    while(scanner.hasNext()){ tat.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/tel.txt"));
//    while(scanner.hasNext()){ tel.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/tha.txt"));
//    while(scanner.hasNext()){ tha.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/tur.txt"));
//    while(scanner.hasNext()){ tur.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/tuk.txt"));
//    while(scanner.hasNext()){ tuk.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/ukr.txt"));
//    while(scanner.hasNext()){ ukr.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/urd.txt"));
//    while(scanner.hasNext()){ urd.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/uig.txt"));
//    while(scanner.hasNext()){ uig.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/uzb.txt"));
//    while(scanner.hasNext()){ uzb.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/vie.txt"));
//    while(scanner.hasNext()){ vie.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/cym.txt"));
//    while(scanner.hasNext()){ cym.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/fry.txt"));
//    while(scanner.hasNext()){ fry.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/xho.txt"));
//    while(scanner.hasNext()){ xho.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/yid.txt"));
//    while(scanner.hasNext()){ yid.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/yor.txt"));
//    while(scanner.hasNext()){ yor.put(scanner.next(), 1); }
//
//    scanner = new Scanner(new File("src/main/resources/zul.txt"));
//    while(scanner.hasNext()){ zul.put(scanner.next(), 1); }

  }


  public static void main(String args[]){
    LanguageDetector languageDetector = new LanguageDetector();
    String language = languageDetector.detectLanguage("սեմինար", true);
    System.out.println(language);
  }

}
