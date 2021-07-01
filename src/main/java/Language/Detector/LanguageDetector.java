package Language.Detector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
  private Map<String, Integer> mya = new HashMap<>();
  private Map<String, Integer> nld = new HashMap<>();
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
  private Map<String, Integer> xho = new HashMap<>();
  private Map<String, Integer> yid = new HashMap<>();
  private Map<String, Integer> yor = new HashMap<>();
  private Map<String, Integer> zul = new HashMap<>();


  public String detectLanguage(String text, boolean getEnglishName){
    if (getEnglishName){
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
    while (stringTokenizer.hasMoreTokens()) textWords.add(removePunctuation(stringTokenizer.nextToken()));

    Map<ISO2Code, Integer> matches = new HashMap<>();
    for (String word : textWords) {
      if (afr.get(word) != null) { matches.put(ISO2Code.afr, (matches.get(ISO2Code.afr) == null) ? 1 : matches.get(ISO2Code.afr).intValue() + 1); }
      if (alb.get(word) != null) { matches.put(ISO2Code.alb, (matches.get(ISO2Code.alb) == null) ? 1 : matches.get(ISO2Code.alb).intValue() + 1); }
      if (amh.get(word) != null) { matches.put(ISO2Code.amh, (matches.get(ISO2Code.amh) == null) ? 1 : matches.get(ISO2Code.amh).intValue() + 1); }
      if (ara.get(word) != null) { matches.put(ISO2Code.ara, (matches.get(ISO2Code.ara) == null) ? 1 : matches.get(ISO2Code.ara).intValue() + 1); }
      if (arm.get(word) != null) { matches.put(ISO2Code.arm, (matches.get(ISO2Code.arm) == null) ? 1 : matches.get(ISO2Code.arm).intValue() + 1); }
      if (aze.get(word) != null) { matches.put(ISO2Code.aze, (matches.get(ISO2Code.aze) == null) ? 1 : matches.get(ISO2Code.aze).intValue() + 1); }
      if (bel.get(word) != null) { matches.put(ISO2Code.bel, (matches.get(ISO2Code.bel) == null) ? 1 : matches.get(ISO2Code.bel).intValue() + 1); }
      if (ben.get(word) != null) { matches.put(ISO2Code.ben, (matches.get(ISO2Code.ben) == null) ? 1 : matches.get(ISO2Code.ben).intValue() + 1); }
      if (bos.get(word) != null) { matches.put(ISO2Code.bos, (matches.get(ISO2Code.bos) == null) ? 1 : matches.get(ISO2Code.bos).intValue() + 1); }
      if (bul.get(word) != null) { matches.put(ISO2Code.bul, (matches.get(ISO2Code.bul) == null) ? 1 : matches.get(ISO2Code.bul).intValue() + 1); }
      if (bur.get(word) != null) { matches.put(ISO2Code.bur, (matches.get(ISO2Code.bur) == null) ? 1 : matches.get(ISO2Code.bur).intValue() + 1); }
      if (cat.get(word) != null) { matches.put(ISO2Code.cat, (matches.get(ISO2Code.cat) == null) ? 1 : matches.get(ISO2Code.cat).intValue() + 1); }
      if (ceb.get(word) != null) { matches.put(ISO2Code.ceb, (matches.get(ISO2Code.ceb) == null) ? 1 : matches.get(ISO2Code.ceb).intValue() + 1); }
      if (ces.get(word) != null) { matches.put(ISO2Code.ces, (matches.get(ISO2Code.ces) == null) ? 1 : matches.get(ISO2Code.ces).intValue() + 1); }
      if (chi.get(word) != null) { matches.put(ISO2Code.chi, (matches.get(ISO2Code.chi) == null) ? 1 : matches.get(ISO2Code.chi).intValue() + 1); }
      if (cos.get(word) != null) { matches.put(ISO2Code.cos, (matches.get(ISO2Code.cos) == null) ? 1 : matches.get(ISO2Code.cos).intValue() + 1); }
      if (cym.get(word) != null) { matches.put(ISO2Code.cym, (matches.get(ISO2Code.cym) == null) ? 1 : matches.get(ISO2Code.cym).intValue() + 1); }
      if (dan.get(word) != null) { matches.put(ISO2Code.dan, (matches.get(ISO2Code.dan) == null) ? 1 : matches.get(ISO2Code.dan).intValue() + 1); }
      if (deu.get(word) != null) { matches.put(ISO2Code.deu, (matches.get(ISO2Code.deu) == null) ? 1 : matches.get(ISO2Code.deu).intValue() + 1); }
      if (ell.get(word) != null) { matches.put(ISO2Code.ell, (matches.get(ISO2Code.ell) == null) ? 1 : matches.get(ISO2Code.ell).intValue() + 1); }
      if (eng.get(word) != null) { matches.put(ISO2Code.eng, (matches.get(ISO2Code.eng) == null) ? 1 : matches.get(ISO2Code.eng).intValue() + 1); }
      if (epo.get(word) != null) { matches.put(ISO2Code.epo, (matches.get(ISO2Code.epo) == null) ? 1 : matches.get(ISO2Code.epo).intValue() + 1); }
      if (est.get(word) != null) { matches.put(ISO2Code.est, (matches.get(ISO2Code.est) == null) ? 1 : matches.get(ISO2Code.est).intValue() + 1); }
      if (eus.get(word) != null) { matches.put(ISO2Code.eus, (matches.get(ISO2Code.eus) == null) ? 1 : matches.get(ISO2Code.eus).intValue() + 1); }
      if (fas.get(word) != null) { matches.put(ISO2Code.fas, (matches.get(ISO2Code.fas) == null) ? 1 : matches.get(ISO2Code.fas).intValue() + 1); }
      if (fil.get(word) != null) { matches.put(ISO2Code.fil, (matches.get(ISO2Code.fil) == null) ? 1 : matches.get(ISO2Code.fil).intValue() + 1); }
      if (fin.get(word) != null) { matches.put(ISO2Code.fin, (matches.get(ISO2Code.fin) == null) ? 1 : matches.get(ISO2Code.fin).intValue() + 1); }
      if (fre.get(word) != null) { matches.put(ISO2Code.fre, (matches.get(ISO2Code.fre) == null) ? 1 : matches.get(ISO2Code.fre).intValue() + 1); }
      if (gla.get(word) != null) { matches.put(ISO2Code.gla, (matches.get(ISO2Code.gla) == null) ? 1 : matches.get(ISO2Code.gla).intValue() + 1); }
      if (gle.get(word) != null) { matches.put(ISO2Code.gle, (matches.get(ISO2Code.gle) == null) ? 1 : matches.get(ISO2Code.gle).intValue() + 1); }
      if (glg.get(word) != null) { matches.put(ISO2Code.glg, (matches.get(ISO2Code.glg) == null) ? 1 : matches.get(ISO2Code.glg).intValue() + 1); }
      if (guj.get(word) != null) { matches.put(ISO2Code.guj, (matches.get(ISO2Code.guj) == null) ? 1 : matches.get(ISO2Code.guj).intValue() + 1); }
      if (hat.get(word) != null) { matches.put(ISO2Code.hat, (matches.get(ISO2Code.hat) == null) ? 1 : matches.get(ISO2Code.hat).intValue() + 1); }
      if (hau.get(word) != null) { matches.put(ISO2Code.hau, (matches.get(ISO2Code.hau) == null) ? 1 : matches.get(ISO2Code.hau).intValue() + 1); }
      if (haw.get(word) != null) { matches.put(ISO2Code.haw, (matches.get(ISO2Code.haw) == null) ? 1 : matches.get(ISO2Code.haw).intValue() + 1); }
      if (heb.get(word) != null) { matches.put(ISO2Code.heb, (matches.get(ISO2Code.heb) == null) ? 1 : matches.get(ISO2Code.heb).intValue() + 1); }
      if (hin.get(word) != null) { matches.put(ISO2Code.hin, (matches.get(ISO2Code.hin) == null) ? 1 : matches.get(ISO2Code.hin).intValue() + 1); }
      if (hmn.get(word) != null) { matches.put(ISO2Code.hmn, (matches.get(ISO2Code.hmn) == null) ? 1 : matches.get(ISO2Code.hmn).intValue() + 1); }
      if (hun.get(word) != null) { matches.put(ISO2Code.hun, (matches.get(ISO2Code.hun) == null) ? 1 : matches.get(ISO2Code.hun).intValue() + 1); }
      if (ibo.get(word) != null) { matches.put(ISO2Code.ibo, (matches.get(ISO2Code.ibo) == null) ? 1 : matches.get(ISO2Code.ibo).intValue() + 1); }
      if (ind.get(word) != null) { matches.put(ISO2Code.ind, (matches.get(ISO2Code.ind) == null) ? 1 : matches.get(ISO2Code.ind).intValue() + 1); }
      if (isl.get(word) != null) { matches.put(ISO2Code.isl, (matches.get(ISO2Code.isl) == null) ? 1 : matches.get(ISO2Code.isl).intValue() + 1); }
      if (ita.get(word) != null) { matches.put(ISO2Code.ita, (matches.get(ISO2Code.ita) == null) ? 1 : matches.get(ISO2Code.ita).intValue() + 1); }
      if (jav.get(word) != null) { matches.put(ISO2Code.jav, (matches.get(ISO2Code.jav) == null) ? 1 : matches.get(ISO2Code.jav).intValue() + 1); }
      if (jpn.get(word) != null) { matches.put(ISO2Code.jpn, (matches.get(ISO2Code.jpn) == null) ? 1 : matches.get(ISO2Code.jpn).intValue() + 1); }
      if (kan.get(word) != null) { matches.put(ISO2Code.kan, (matches.get(ISO2Code.kan) == null) ? 1 : matches.get(ISO2Code.kan).intValue() + 1); }
      if (kat.get(word) != null) { matches.put(ISO2Code.kat, (matches.get(ISO2Code.kat) == null) ? 1 : matches.get(ISO2Code.kat).intValue() + 1); }
      if (kaz.get(word) != null) { matches.put(ISO2Code.kaz, (matches.get(ISO2Code.kaz) == null) ? 1 : matches.get(ISO2Code.kaz).intValue() + 1); }
      if (khm.get(word) != null) { matches.put(ISO2Code.khm, (matches.get(ISO2Code.khm) == null) ? 1 : matches.get(ISO2Code.khm).intValue() + 1); }
      if (kin.get(word) != null) { matches.put(ISO2Code.kin, (matches.get(ISO2Code.kin) == null) ? 1 : matches.get(ISO2Code.kin).intValue() + 1); }
      if (kir.get(word) != null) { matches.put(ISO2Code.kir, (matches.get(ISO2Code.kir) == null) ? 1 : matches.get(ISO2Code.kir).intValue() + 1); }
      if (kor.get(word) != null) { matches.put(ISO2Code.kor, (matches.get(ISO2Code.kor) == null) ? 1 : matches.get(ISO2Code.kor).intValue() + 1); }
      if (kur.get(word) != null) { matches.put(ISO2Code.kur, (matches.get(ISO2Code.kur) == null) ? 1 : matches.get(ISO2Code.kur).intValue() + 1); }
      if (lao.get(word) != null) { matches.put(ISO2Code.lao, (matches.get(ISO2Code.lao) == null) ? 1 : matches.get(ISO2Code.lao).intValue() + 1); }
      if (lat.get(word) != null) { matches.put(ISO2Code.lat, (matches.get(ISO2Code.lat) == null) ? 1 : matches.get(ISO2Code.lat).intValue() + 1); }
      if (lav.get(word) != null) { matches.put(ISO2Code.lav, (matches.get(ISO2Code.lav) == null) ? 1 : matches.get(ISO2Code.lav).intValue() + 1); }
      if (lit.get(word) != null) { matches.put(ISO2Code.lit, (matches.get(ISO2Code.lit) == null) ? 1 : matches.get(ISO2Code.lit).intValue() + 1); }
      if (ltz.get(word) != null) { matches.put(ISO2Code.ltz, (matches.get(ISO2Code.ltz) == null) ? 1 : matches.get(ISO2Code.ltz).intValue() + 1); }
      if (mal.get(word) != null) { matches.put(ISO2Code.mal, (matches.get(ISO2Code.mal) == null) ? 1 : matches.get(ISO2Code.mal).intValue() + 1); }
      if (mar.get(word) != null) { matches.put(ISO2Code.mar, (matches.get(ISO2Code.mar) == null) ? 1 : matches.get(ISO2Code.mar).intValue() + 1); }
      if (mkd.get(word) != null) { matches.put(ISO2Code.mkd, (matches.get(ISO2Code.mkd) == null) ? 1 : matches.get(ISO2Code.mkd).intValue() + 1); }
      if (mlg.get(word) != null) { matches.put(ISO2Code.mlg, (matches.get(ISO2Code.mlg) == null) ? 1 : matches.get(ISO2Code.mlg).intValue() + 1); }
      if (mlt.get(word) != null) { matches.put(ISO2Code.mlt, (matches.get(ISO2Code.mlt) == null) ? 1 : matches.get(ISO2Code.mlt).intValue() + 1); }
      if (mon.get(word) != null) { matches.put(ISO2Code.mon, (matches.get(ISO2Code.mon) == null) ? 1 : matches.get(ISO2Code.mon).intValue() + 1); }
      if (mri.get(word) != null) { matches.put(ISO2Code.mri, (matches.get(ISO2Code.mri) == null) ? 1 : matches.get(ISO2Code.mri).intValue() + 1); }
      if (msa.get(word) != null) { matches.put(ISO2Code.msa, (matches.get(ISO2Code.msa) == null) ? 1 : matches.get(ISO2Code.msa).intValue() + 1); }
      if (mya.get(word) != null) { matches.put(ISO2Code.mya, (matches.get(ISO2Code.mya) == null) ? 1 : matches.get(ISO2Code.mya).intValue() + 1); }
      if (nep.get(word) != null) { matches.put(ISO2Code.nep, (matches.get(ISO2Code.nep) == null) ? 1 : matches.get(ISO2Code.nep).intValue() + 1); }
      if (nld.get(word) != null) { matches.put(ISO2Code.nld, (matches.get(ISO2Code.nld) == null) ? 1 : matches.get(ISO2Code.nld).intValue() + 1); }
      if (nor.get(word) != null) { matches.put(ISO2Code.nor, (matches.get(ISO2Code.nor) == null) ? 1 : matches.get(ISO2Code.nor).intValue() + 1); }
      if (nya.get(word) != null) { matches.put(ISO2Code.nya, (matches.get(ISO2Code.nya) == null) ? 1 : matches.get(ISO2Code.nya).intValue() + 1); }
      if (ori.get(word) != null) { matches.put(ISO2Code.ori, (matches.get(ISO2Code.ori) == null) ? 1 : matches.get(ISO2Code.ori).intValue() + 1); }
      if (pan.get(word) != null) { matches.put(ISO2Code.pan, (matches.get(ISO2Code.pan) == null) ? 1 : matches.get(ISO2Code.pan).intValue() + 1); }
      if (pol.get(word) != null) { matches.put(ISO2Code.pol, (matches.get(ISO2Code.pol) == null) ? 1 : matches.get(ISO2Code.pol).intValue() + 1); }
      if (por.get(word) != null) { matches.put(ISO2Code.por, (matches.get(ISO2Code.por) == null) ? 1 : matches.get(ISO2Code.por).intValue() + 1); }
      if (pus.get(word) != null) { matches.put(ISO2Code.pus, (matches.get(ISO2Code.pus) == null) ? 1 : matches.get(ISO2Code.pus).intValue() + 1); }
      if (ron.get(word) != null) { matches.put(ISO2Code.ron, (matches.get(ISO2Code.ron) == null) ? 1 : matches.get(ISO2Code.ron).intValue() + 1); }
      if (rus.get(word) != null) { matches.put(ISO2Code.rus, (matches.get(ISO2Code.rus) == null) ? 1 : matches.get(ISO2Code.rus).intValue() + 1); }
      if (sin.get(word) != null) { matches.put(ISO2Code.sin, (matches.get(ISO2Code.sin) == null) ? 1 : matches.get(ISO2Code.sin).intValue() + 1); }
      if (slk.get(word) != null) { matches.put(ISO2Code.slk, (matches.get(ISO2Code.slk) == null) ? 1 : matches.get(ISO2Code.slk).intValue() + 1); }
      if (slv.get(word) != null) { matches.put(ISO2Code.slv, (matches.get(ISO2Code.slv) == null) ? 1 : matches.get(ISO2Code.slv).intValue() + 1); }
      if (smo.get(word) != null) { matches.put(ISO2Code.smo, (matches.get(ISO2Code.smo) == null) ? 1 : matches.get(ISO2Code.smo).intValue() + 1); }
      if (sna.get(word) != null) { matches.put(ISO2Code.sna, (matches.get(ISO2Code.sna) == null) ? 1 : matches.get(ISO2Code.sna).intValue() + 1); }
      if (snd.get(word) != null) { matches.put(ISO2Code.snd, (matches.get(ISO2Code.snd) == null) ? 1 : matches.get(ISO2Code.snd).intValue() + 1); }
      if (som.get(word) != null) { matches.put(ISO2Code.som, (matches.get(ISO2Code.som) == null) ? 1 : matches.get(ISO2Code.som).intValue() + 1); }
      if (sot.get(word) != null) { matches.put(ISO2Code.sot, (matches.get(ISO2Code.sot) == null) ? 1 : matches.get(ISO2Code.sot).intValue() + 1); }
      if (spa.get(word) != null) { matches.put(ISO2Code.spa, (matches.get(ISO2Code.spa) == null) ? 1 : matches.get(ISO2Code.spa).intValue() + 1); }
      if (srp.get(word) != null) { matches.put(ISO2Code.srp, (matches.get(ISO2Code.srp) == null) ? 1 : matches.get(ISO2Code.srp).intValue() + 1); }
      if (sun.get(word) != null) { matches.put(ISO2Code.sun, (matches.get(ISO2Code.sun) == null) ? 1 : matches.get(ISO2Code.sun).intValue() + 1); }
      if (swa.get(word) != null) { matches.put(ISO2Code.swa, (matches.get(ISO2Code.swa) == null) ? 1 : matches.get(ISO2Code.swa).intValue() + 1); }
      if (swe.get(word) != null) { matches.put(ISO2Code.swe, (matches.get(ISO2Code.swe) == null) ? 1 : matches.get(ISO2Code.swe).intValue() + 1); }
      if (tam.get(word) != null) { matches.put(ISO2Code.tam, (matches.get(ISO2Code.tam) == null) ? 1 : matches.get(ISO2Code.tam).intValue() + 1); }
      if (tat.get(word) != null) { matches.put(ISO2Code.tat, (matches.get(ISO2Code.tat) == null) ? 1 : matches.get(ISO2Code.tat).intValue() + 1); }
      if (tel.get(word) != null) { matches.put(ISO2Code.tel, (matches.get(ISO2Code.tel) == null) ? 1 : matches.get(ISO2Code.tel).intValue() + 1); }
      if (tgk.get(word) != null) { matches.put(ISO2Code.tgk, (matches.get(ISO2Code.tgk) == null) ? 1 : matches.get(ISO2Code.tgk).intValue() + 1); }
      if (tha.get(word) != null) { matches.put(ISO2Code.tha, (matches.get(ISO2Code.tha) == null) ? 1 : matches.get(ISO2Code.tha).intValue() + 1); }
      if (tuk.get(word) != null) { matches.put(ISO2Code.tuk, (matches.get(ISO2Code.tuk) == null) ? 1 : matches.get(ISO2Code.tuk).intValue() + 1); }
      if (tur.get(word) != null) { matches.put(ISO2Code.tur, (matches.get(ISO2Code.tur) == null) ? 1 : matches.get(ISO2Code.tur).intValue() + 1); }
      if (uig.get(word) != null) { matches.put(ISO2Code.uig, (matches.get(ISO2Code.uig) == null) ? 1 : matches.get(ISO2Code.uig).intValue() + 1); }
      if (ukr.get(word) != null) { matches.put(ISO2Code.ukr, (matches.get(ISO2Code.ukr) == null) ? 1 : matches.get(ISO2Code.ukr).intValue() + 1); }
      if (urd.get(word) != null) { matches.put(ISO2Code.urd, (matches.get(ISO2Code.urd) == null) ? 1 : matches.get(ISO2Code.urd).intValue() + 1); }
      if (uzb.get(word) != null) { matches.put(ISO2Code.uzb, (matches.get(ISO2Code.uzb) == null) ? 1 : matches.get(ISO2Code.uzb).intValue() + 1); }
      if (vie.get(word) != null) { matches.put(ISO2Code.vie, (matches.get(ISO2Code.vie) == null) ? 1 : matches.get(ISO2Code.vie).intValue() + 1); }
      if (xho.get(word) != null) { matches.put(ISO2Code.xho, (matches.get(ISO2Code.xho) == null) ? 1 : matches.get(ISO2Code.xho).intValue() + 1); }
      if (yid.get(word) != null) { matches.put(ISO2Code.yid, (matches.get(ISO2Code.yid) == null) ? 1 : matches.get(ISO2Code.yid).intValue() + 1); }
      if (yor.get(word) != null) { matches.put(ISO2Code.yor, (matches.get(ISO2Code.yor) == null) ? 1 : matches.get(ISO2Code.yor).intValue() + 1); }
      if (zul.get(word) != null) { matches.put(ISO2Code.zul, (matches.get(ISO2Code.zul) == null) ? 1 : matches.get(ISO2Code.zul).intValue() + 1); }
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
    Scanner scanner = new Scanner(this.getClass().getResourceAsStream("/afr.txt"));
    while(scanner.hasNext()){ afr.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/alb.txt"));
    while(scanner.hasNext()){ alb.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/amh.txt"));
    while(scanner.hasNext()){ amh.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ara.txt"));
    while(scanner.hasNext()){ ara.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/arm.txt"));
    while(scanner.hasNext()){ arm.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/aze.txt"));
    while(scanner.hasNext()){ aze.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ben.txt"));
    while(scanner.hasNext()){ ben.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/eus.txt"));
    while(scanner.hasNext()){ eus.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/bel.txt"));
    while(scanner.hasNext()){ bel.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/bos.txt"));
    while(scanner.hasNext()){ bos.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/bul.txt"));
    while(scanner.hasNext()){ bul.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/bur.txt"));
    while(scanner.hasNext()){ bur.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/cat.txt"));
    while(scanner.hasNext()){ cat.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ceb.txt"));
    while(scanner.hasNext()){ ceb.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/chi.txt"));
    while(scanner.hasNext()){ chi.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/cos.txt"));
    while(scanner.hasNext()){ cos.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ces.txt"));
    while(scanner.hasNext()){ ces.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/dan.txt"));
    while(scanner.hasNext()){ dan.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/eng.txt"));
    while(scanner.hasNext()){ eng.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/epo.txt"));
    while(scanner.hasNext()){ epo.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/est.txt"));
    while(scanner.hasNext()){ est.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/fil.txt"));
    while(scanner.hasNext()){ fil.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/fin.txt"));
    while(scanner.hasNext()){ fin.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/fre.txt"));
    while(scanner.hasNext()){ fre.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/glg.txt"));
    while(scanner.hasNext()){ glg.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/kat.txt"));
    while(scanner.hasNext()){ kat.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/deu.txt"));
    while(scanner.hasNext()){ deu.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ell.txt"));
    while(scanner.hasNext()){ ell.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/guj.txt"));
    while(scanner.hasNext()){ guj.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/hat.txt"));
    while(scanner.hasNext()){ hat.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/hau.txt"));
    while(scanner.hasNext()){ hau.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/haw.txt"));
    while(scanner.hasNext()){ haw.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/heb.txt"));
    while(scanner.hasNext()){ heb.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/hin.txt"));
    while(scanner.hasNext()){ hin.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/hmn.txt"));
    while(scanner.hasNext()){ hmn.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/hun.txt"));
    while(scanner.hasNext()){ hun.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/isl.txt"));
    while(scanner.hasNext()){ isl.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ibo.txt"));
    while(scanner.hasNext()){ ibo.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ind.txt"));
    while(scanner.hasNext()){ ind.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/gle.txt"));
    while(scanner.hasNext()){ gle.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ita.txt"));
    while(scanner.hasNext()){ ita.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/jpn.txt"));
    while(scanner.hasNext()){ jpn.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/jav.txt"));
    while(scanner.hasNext()){ jav.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/kan.txt"));
    while(scanner.hasNext()){ kan.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/kaz.txt"));
    while(scanner.hasNext()){ kaz.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/khm.txt"));
    while(scanner.hasNext()){ khm.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/kin.txt"));
    while(scanner.hasNext()){ kin.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/kor.txt"));
    while(scanner.hasNext()){ kor.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/kur.txt"));
    while(scanner.hasNext()){ kur.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/kir.txt"));
    while(scanner.hasNext()){ kir.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/lao.txt"));
    while(scanner.hasNext()){ lao.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/lat.txt"));
    while(scanner.hasNext()){ lat.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/lav.txt"));
    while(scanner.hasNext()){ lav.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/lit.txt"));
    while(scanner.hasNext()){ lit.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ltz.txt"));
    while(scanner.hasNext()){ ltz.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mkd.txt"));
    while(scanner.hasNext()){ mkd.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mlg.txt"));
    while(scanner.hasNext()){ mlg.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/msa.txt"));
    while(scanner.hasNext()){ msa.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mya.txt"));
    while(scanner.hasNext()){ mya.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/nld.txt"));
    while(scanner.hasNext()){ nld.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mal.txt"));
    while(scanner.hasNext()){ mal.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mlt.txt"));
    while(scanner.hasNext()){ mlt.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mri.txt"));
    while(scanner.hasNext()){ mri.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mar.txt"));
    while(scanner.hasNext()){ mar.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/mon.txt"));
    while(scanner.hasNext()){ mon.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/nep.txt"));
    while(scanner.hasNext()){ nep.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/nor.txt"));
    while(scanner.hasNext()){ nor.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/nya.txt"));
    while(scanner.hasNext()){ nya.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ori.txt"));
    while(scanner.hasNext()){ ori.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/pus.txt"));
    while(scanner.hasNext()){ pus.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/fas.txt"));
    while(scanner.hasNext()){ fas.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/pol.txt"));
    while(scanner.hasNext()){ pol.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/por.txt"));
    while(scanner.hasNext()){ por.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/pan.txt"));
    while(scanner.hasNext()){ pan.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ron.txt"));
    while(scanner.hasNext()){ ron.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/rus.txt"));
    while(scanner.hasNext()){ rus.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/smo.txt"));
    while(scanner.hasNext()){ smo.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/gla.txt"));
    while(scanner.hasNext()){ gla.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/srp.txt"));
    while(scanner.hasNext()){ srp.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/sna.txt"));
    while(scanner.hasNext()){ sna.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/snd.txt"));
    while(scanner.hasNext()){ snd.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/sin.txt"));
    while(scanner.hasNext()){ sin.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/slk.txt"));
    while(scanner.hasNext()){ slk.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/slv.txt"));
    while(scanner.hasNext()){ slv.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/som.txt"));
    while(scanner.hasNext()){ som.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/sot.txt"));
    while(scanner.hasNext()){ sot.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/spa.txt"));
    while(scanner.hasNext()){ spa.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/sun.txt"));
    while(scanner.hasNext()){ sun.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/swa.txt"));
    while(scanner.hasNext()){ swa.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/swe.txt"));
    while(scanner.hasNext()){ swe.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/tgk.txt"));
    while(scanner.hasNext()){ tgk.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/tam.txt"));
    while(scanner.hasNext()){ tam.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/tat.txt"));
    while(scanner.hasNext()){ tat.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/tel.txt"));
    while(scanner.hasNext()){ tel.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/tha.txt"));
    while(scanner.hasNext()){ tha.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/tur.txt"));
    while(scanner.hasNext()){ tur.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/tuk.txt"));
    while(scanner.hasNext()){ tuk.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/ukr.txt"));
    while(scanner.hasNext()){ ukr.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/urd.txt"));
    while(scanner.hasNext()){ urd.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/uig.txt"));
    while(scanner.hasNext()){ uig.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/uzb.txt"));
    while(scanner.hasNext()){ uzb.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/vie.txt"));
    while(scanner.hasNext()){ vie.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/cym.txt"));
    while(scanner.hasNext()){ cym.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/xho.txt"));
    while(scanner.hasNext()){ xho.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/yid.txt"));
    while(scanner.hasNext()){ yid.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/yor.txt"));
    while(scanner.hasNext()){ yor.put(scanner.next(), 1); }

    scanner = new Scanner(this.getClass().getResourceAsStream("/zul.txt"));
    while(scanner.hasNext()){ zul.put(scanner.next(), 1); }

  }

  private String removePunctuation(String word){
    String newWord = word;
    if (!Character.isLetter(word.charAt(0))){
      newWord = word.substring(1);
    }

    if (!Character.isLetter(word.charAt(word.length() - 1))){
      newWord = newWord.substring(0, newWord.length() - 1);
    }

    return newWord;
  }


}
