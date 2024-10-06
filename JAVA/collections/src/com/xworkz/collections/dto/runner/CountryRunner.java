package com.xworkz.collections.dto.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collections.constants.Continent;
import com.xworkz.collections.constants.CountryCode;
import com.xworkz.collections.dto.CountryDTO;

public class CountryRunner {

	public static void main(String[] args) {

		Collection<CountryDTO> countries = new LinkedList<CountryDTO>();
		countries.add(new CountryDTO("Afghanistan", CountryCode.AF, 40066327, "Mohammad Ashraf Ghani", Continent.ASIA));
		countries.add(new CountryDTO("Albania", CountryCode.AL, 2866376, "Bajram Begaj", Continent.EUROPE));
		countries.add(new CountryDTO("Algeria", CountryCode.DZ, 45350148, "Abdelmadjid Tebboune", Continent.AFRICA));
		countries.add(new CountryDTO("Andorra", CountryCode.AD, 79034, "Xavier Espot Zamora", Continent.EUROPE));
		countries.add(new CountryDTO("Angola", CountryCode.AO, 36684202, "João Lourenço", Continent.AFRICA));
		countries.add(
				new CountryDTO("Antigua and Barbuda", CountryCode.AG, 93219, "Gaston Browne", Continent.NORTH_AMERICA));
		countries.add(
				new CountryDTO("Argentina", CountryCode.AR, 45801430, "Alberto Fernández", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Armenia", CountryCode.AM, 2961600, "Vahagn Khachaturyan", Continent.ASIA));
		countries.add(new CountryDTO("Australia", CountryCode.AU, 26166836, "Anthony Albanese", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Austria", CountryCode.AT, 8901064, "Alexander Van der Bellen", Continent.EUROPE));
		countries.add(new CountryDTO("Azerbaijan", CountryCode.AZ, 10313375, "Ilham Aliyev", Continent.ASIA));
		countries.add(new CountryDTO("Bahamas", CountryCode.BS, 403095, "Philip Davis", Continent.NORTH_AMERICA));
		countries
				.add(new CountryDTO("Bahrain", CountryCode.BH, 1755071, "Salman bin Hamad Al Khalifa", Continent.ASIA));
		countries.add(new CountryDTO("Bangladesh", CountryCode.BD, 172123569, "Mohammed Shahabuddin", Continent.ASIA));
		countries.add(new CountryDTO("Barbados", CountryCode.BB, 287025, "Sandra Mason", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Belarus", CountryCode.BY, 9432800, "Alexander Lukashenko", Continent.EUROPE));
		countries.add(new CountryDTO("Belgium", CountryCode.BE, 11602913, "Alexander De Croo", Continent.EUROPE));
		countries.add(new CountryDTO("Belize", CountryCode.BZ, 441471, "John Briceno", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Benin", CountryCode.BJ, 13743690, "Patrice Talon", Continent.AFRICA));
		countries.add(new CountryDTO("Bhutan", CountryCode.BT, 748931, "Lotay Tshering", Continent.ASIA));
		countries.add(new CountryDTO("Bolivia", CountryCode.BO, 12138234, "Luis Arce", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Bosnia and Herzegovina", CountryCode.BA, 3254627, "komsi", Continent.EUROPE));
		countries.add(new CountryDTO("Botswana", CountryCode.BW, 2588831, "Mokgweetsi Masisi", Continent.AFRICA));
		countries.add(new CountryDTO("Brazil", CountryCode.BR, 215351677, "Luiz Inácio Lula da Silva",
				Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Brunei", CountryCode.BN, 464478, "Hassanal Bolkiah", Continent.ASIA));
		countries.add(new CountryDTO("Bulgaria", CountryCode.BG, 6781953, "Rumen Radev", Continent.EUROPE));
		countries.add(new CountryDTO("Burkina Faso", CountryCode.BF, 23800518, "Ibrahim Traoré", Continent.AFRICA));
		countries.add(new CountryDTO("Burundi", CountryCode.BI, 13473465, "Évariste Ndayishimiye", Continent.AFRICA));
		countries.add(new CountryDTO("Cabo Verde", CountryCode.CV, 556946, "José Maria Neves", Continent.AFRICA));
		countries.add(new CountryDTO("Cambodia", CountryCode.KH, 17402490, "Hun Sen", Continent.ASIA));
		countries.add(new CountryDTO("Cameroon", CountryCode.CM, 27413740, "Paul Biya", Continent.AFRICA));
		countries.add(new CountryDTO("Canada", CountryCode.CA, 38131104, "Mary Simon", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Central African Republic", CountryCode.CF, 5618023, "Faustin-Archange Touadéra",
				Continent.AFRICA));
		countries.add(new CountryDTO("Chad", CountryCode.TD, 17392536, "Mahamat Idriss Déby Itno", Continent.AFRICA));
		countries.add(new CountryDTO("Chile", CountryCode.CL, 19212362, "Gabriel Boric", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("China", CountryCode.CN, 1444216107, "Xi Jinping", Continent.ASIA));
		countries.add(new CountryDTO("Colombia", CountryCode.CO, 51874024, "Gustavo Petro", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Comoros", CountryCode.KM, 869601, "Azali Assoumani", Continent.AFRICA));
		countries.add(new CountryDTO("Congo (Democratic Republic)", CountryCode.CD, 101780263, "Félix Tshisekedi",
				Continent.AFRICA));
		countries.add(
				new CountryDTO("Congo (Republic)", CountryCode.CG, 5776765, "Denis Sassou Nguesso", Continent.AFRICA));
		countries.add(new CountryDTO("Costa Rica", CountryCode.CR, 5185000, "Rodrigo Chaves Robles",
				Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Croatia", CountryCode.HR, 3870000, "Zoran Milanovi", Continent.EUROPE));
		countries.add(new CountryDTO("Cuba", CountryCode.CU, 11209628, "Miguel Díaz-Canel", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Cyprus", CountryCode.CY, 1207359, "Nicos Anastasiades", Continent.EUROPE));
		countries.add(new CountryDTO("Czech Republic", CountryCode.CZ, 10701777, "Petr Pavel", Continent.EUROPE));
		countries.add(new CountryDTO("Denmark", CountryCode.DK, 5831404, "Margrethe II", Continent.EUROPE));
		countries.add(new CountryDTO("Djibouti", CountryCode.DJ, 1078373, "Ismail Omar Guelleh", Continent.AFRICA));
		countries.add(new CountryDTO("Dominica", CountryCode.DM, 72182, "Roosevelt Skerrit", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Dominican Republic", CountryCode.DO, 10996720, "Luis Abinader",
				Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("East Timor", CountryCode.TL, 1387149, "José Ramos-Horta", Continent.ASIA));
		countries.add(new CountryDTO("Ecuador", CountryCode.EC, 17847829, "Guillermo Lasso", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Egypt", CountryCode.EG, 104258327, "Abdel Fattah el-Sisi", Continent.AFRICA));
		countries.add(new CountryDTO("El Salvador", CountryCode.SV, 6486201, "Nayib Bukele", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Equatorial Guinea", CountryCode.GQ, 1551783, "Teodoro Obiang Nguema Mbasogo",
				Continent.AFRICA));
		countries.add(new CountryDTO("Eritrea", CountryCode.ER, 3546437, "Isaias Afwerki", Continent.AFRICA));
		countries.add(new CountryDTO("Estonia", CountryCode.EE, 1331496, "Alar Karis", Continent.EUROPE));
		countries.add(new CountryDTO("Eswatini", CountryCode.SZ, 1160164, "Mswati III", Continent.AFRICA));
		countries.add(new CountryDTO("Ethiopia", CountryCode.ET, 126527060, "Sahle-Work Zewde", Continent.AFRICA));
		countries.add(new CountryDTO("Fiji", CountryCode.FJ, 926276, "Wiliame Katonivere", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Finland", CountryCode.FI, 5536146, "Sauli Niinistö", Continent.EUROPE));
		countries.add(new CountryDTO("France", CountryCode.FR, 67399000, "Emmanuel Macron", Continent.EUROPE));
		countries.add(new CountryDTO("Gabon", CountryCode.GA, 2230357, "Ali Bongo Ondimba", Continent.AFRICA));
		countries.add(new CountryDTO("Gambia", CountryCode.GM, 2416668, "Adama Barrow", Continent.AFRICA));
		countries.add(new CountryDTO("Georgia", CountryCode.GE, 3714000, "Salome Zourabichvili", Continent.EUROPE));
		countries.add(new CountryDTO("Germany", CountryCode.DE, 83129285, "Frank-Walter Steinmeier", Continent.EUROPE));
		countries.add(new CountryDTO("Ghana", CountryCode.GH, 32810445, "Nana Akufo-Addo", Continent.AFRICA));
		countries.add(new CountryDTO("Greece", CountryCode.GR, 10418240, "Katerina Sakellaropoulou", Continent.EUROPE));
		countries.add(new CountryDTO("Grenada", CountryCode.GD, 124610, "Dickon Mitchell", Continent.NORTH_AMERICA));
		countries.add(
				new CountryDTO("Guatemala", CountryCode.GT, 18437961, "Alejandro Giammattei", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Guinea", CountryCode.GN, 13271348, "Mamady Doumbouya", Continent.AFRICA));
		countries.add(
				new CountryDTO("Guinea-Bissau", CountryCode.GW, 2013999, "Umaro Sissoco Embaló", Continent.AFRICA));
		countries.add(new CountryDTO("Guyana", CountryCode.GY, 786559, "Irfaan Ali", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Haiti", CountryCode.HT, 11577779, "Ariel Henry", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Honduras", CountryCode.HN, 10398617, "Xiomara Castro", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Hungary", CountryCode.HU, 9653000, "Katalin Novák", Continent.EUROPE));
		countries.add(new CountryDTO("Iceland", CountryCode.IS, 376248, "Guðni Th. Jóhannesson", Continent.EUROPE));
		countries.add(new CountryDTO("India", CountryCode.IN, 1393409038, "Droupadi Murmu", Continent.ASIA));
		countries.add(new CountryDTO("Indonesia", CountryCode.ID, 273753191, "Joko Widodo", Continent.ASIA));
		countries.add(new CountryDTO("Iran", CountryCode.IR, 85759000L, "Ebrahim Raisi", Continent.ASIA));
		countries.add(new CountryDTO("Iraq", CountryCode.IR, 44615000L, "Abdul Latif Rashid", Continent.ASIA));
		countries.add(new CountryDTO("Ireland", CountryCode.IR, 5231970L, "Michael D. Higgins", Continent.EUROPE));
		countries.add(new CountryDTO("Israel", CountryCode.IS, 9580000L, "Isaac Herzog", Continent.ASIA));
		countries.add(new CountryDTO("Italy", CountryCode.IT, 59729081L, "Sergio Mattarella", Continent.EUROPE));
		countries.add(new CountryDTO("Jamaica", CountryCode.JM, 2726667L, "Patrick Allen", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Japan", CountryCode.JP, 124214766L, "Fumio Kishida", Continent.ASIA));
		countries.add(new CountryDTO("Jordan", CountryCode.JO, 10319673L, "Abdullah II", Continent.ASIA));
		countries.add(new CountryDTO("Kazakhstan", CountryCode.KN, 19265325L, "Kassym-Jomart Tokayev", Continent.ASIA));
		countries.add(new CountryDTO("Kenya", CountryCode.KE, 54637651L, "William Ruto", Continent.AFRICA));
		countries.add(new CountryDTO("Kiribati", CountryCode.KI, 122300L, "Taneti Maamau", Continent.AUSTRALIA));
		countries.add(
				new CountryDTO("Kuwait", CountryCode.KW, 4649702L, "Nawaf Al-Ahmad Al-Jaber Al-Sabah", Continent.ASIA));
		countries.add(new CountryDTO("Kyrgyzstan", CountryCode.KG, 6776000L, "Sadyr Japarov", Continent.ASIA));
		countries.add(new CountryDTO("Laos", CountryCode.LA, 7316000L, "Thongloun Sisoulith", Continent.ASIA));
		countries.add(new CountryDTO("Latvia", CountryCode.LT, 1850737L, "Edgars RinkÄ“viÄ?s", Continent.EUROPE));
		countries.add(new CountryDTO("Lebanon", CountryCode.LB, 5615000L, "Vacant", Continent.ASIA));
		countries.add(new CountryDTO("Lesotho", CountryCode.LS, 2142249L, "Letsie III", Continent.AFRICA));
		countries.add(new CountryDTO("Liberia", CountryCode.LI, 5376000L, "George Weah", Continent.AFRICA));
		countries.add(new CountryDTO("Libya", CountryCode.LI, 6944866L, "Mohamed al-Menfi", Continent.AFRICA));
		countries.add(new CountryDTO("Liechtenstein", CountryCode.LC, 38749L,
				"Alois, Hereditary Prince of Liechtenstein", Continent.EUROPE));
		countries.add(new CountryDTO("Lithuania", CountryCode.LI, 2722000L, "Gitanas NausÄ—da", Continent.EUROPE));
		countries.add(new CountryDTO("Luxembourg", CountryCode.LU, 634730L, "Henri, Grand Duke of Luxembourg",
				Continent.EUROPE));
		countries.add(new CountryDTO("Madagascar", CountryCode.MA, 29808000L, "Andry Rajoelina", Continent.AFRICA));
		countries.add(new CountryDTO("Malawi", CountryCode.MA, 20043000L, "Lazarus Chakwera", Continent.AFRICA));
		countries.add(new CountryDTO("Malaysia", CountryCode.ME, 33232000L, "Abdullah of Pahang", Continent.ASIA));
		countries.add(new CountryDTO("Maldives", CountryCode.MA, 515696L, "Ibrahim Mohamed Solih", Continent.ASIA));
		countries.add(new CountryDTO("Mali", CountryCode.ML, 22777000L, "Assimi GoÃ¯ta", Continent.AFRICA));
		countries.add(new CountryDTO("Malta", CountryCode.MT, 514564L, "George Vella", Continent.EUROPE));
		countries.add(new CountryDTO("Marshall Islands", CountryCode.MY, 59300L, "David Kabua", Continent.AUSTRALIA));
		countries.add(
				new CountryDTO("Mauritania", CountryCode.MA, 4679500L, "Mohamed Ould Ghazouani", Continent.AFRICA));
		countries.add(new CountryDTO("Mauritius", CountryCode.MR, 1271368L, "Prithvirajsing Roopun", Continent.AFRICA));
		countries.add(new CountryDTO("Mexico", CountryCode.ME, 126577691L, "AndrÃ©s Manuel LÃ³pez Obrador",
				Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Micronesia", CountryCode.MR, 115000L, "Wesley Simina", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Moldova", CountryCode.MA, 2654000L, "Maia Sandu", Continent.EUROPE));
		countries.add(new CountryDTO("Monaco", CountryCode.MN, 39242L, "Albert 11", Continent.EUROPE));
		countries.add(new CountryDTO("Mongolia", CountryCode.MG, 3391400L, "Ukhnaagiin KhÃ¼relsÃ¼kh", Continent.ASIA));
		countries.add(new CountryDTO("Montenegro", CountryCode.MT, 616294L, "Jakov MilatoviÄ‡", Continent.EUROPE));
		countries.add(new CountryDTO("Morocco", CountryCode.MC, 37500000L, "Mohammed VI", Continent.AFRICA));
		countries.add(new CountryDTO("Mozambique", CountryCode.MA, 32482640L, "Filipe Nyusi", Continent.AFRICA));
		countries.add(new CountryDTO("Myanmar", CountryCode.MY, 54770000L, "Myint Swe", Continent.ASIA));
		countries.add(new CountryDTO("Namibia", CountryCode.NA, 2563200L, "Hage Geingob", Continent.AFRICA));
		countries.add(new CountryDTO("Nauru", CountryCode.NR, 10600L, "Russ Kun", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Nepal", CountryCode.NE, 30223000L, "Ram Chandra Poudel", Continent.ASIA));
		countries.add(new CountryDTO("Netherlands", CountryCode.NE, 17459731L, "Willem-Alexander", Continent.EUROPE));
		countries.add(new CountryDTO("New Zealand", CountryCode.NZ, 5133000L, "Cindy Kiro", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Nicaragua", CountryCode.NI, 6978315L, "Daniel Ortega", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Niger", CountryCode.NI, 26040000L, "Abdourahamane Tiani", Continent.AFRICA));
		countries.add(new CountryDTO("Nigeria", CountryCode.NI, 223804632L, "Bola Tinubu", Continent.AFRICA));
		countries.add(new CountryDTO("North Korea", CountryCode.NO, 26101384L, "Kim Jong-un", Continent.ASIA));
		countries.add(new CountryDTO("Macedonia", CountryCode.NO, 2077132L, "Stevo Pendarovski", Continent.EUROPE));
		countries.add(new CountryDTO("Norway", CountryCode.NR, 5456320L, "Harald V", Continent.EUROPE));
		countries.add(new CountryDTO("Oman", CountryCode.OM, 4800000L, "Haitham bin Tariq", Continent.ASIA));
		countries.add(new CountryDTO("Pakistan", CountryCode.PA, 241491960L, "Arif Alvi", Continent.ASIA));
		countries.add(new CountryDTO("Palau", CountryCode.PA, 18092L, "Surangel Whipps Jr.", Continent.AUSTRALIA));
		countries
				.add(new CountryDTO("Panama", CountryCode.PA, 4314767L, "Laurentino Cortizo", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Papua New Guinea", CountryCode.PA, 9006347L, "Bob Dadae", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Paraguay", CountryCode.PA, 7132530L, "Santiago PeÃ±a", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Peru", CountryCode.PE, 33933108L, "Dina Boluarte", Continent.SOUTH_AMERICA));
		countries
				.add(new CountryDTO("Philippines", CountryCode.PH, 113900000L, "Ferdinand Marcos Jr.", Continent.ASIA));
		countries.add(new CountryDTO("Poland", CountryCode.PL, 37973352L, "Andrzej Duda", Continent.EUROPE));
		countries.add(
				new CountryDTO("Portugal", CountryCode.PG, 10295909L, "Marcelo Rebelo de Sousa", Continent.EUROPE));
		countries.add(new CountryDTO("Qatar", CountryCode.QA, 2930526L, "Tamim bin Hamad Al Thani", Continent.ASIA));
		countries.add(new CountryDTO("Romania", CountryCode.RO, 19098175L, "Klaus Iohannis", Continent.EUROPE));
		countries.add(new CountryDTO("Russia", CountryCode.RU, 146440000L, "Vladimir Putin", Continent.EUROPE));
		countries.add(new CountryDTO("Rwanda", CountryCode.RW, 13963000L, "Paul Kagame", Continent.AFRICA));
		countries.add(new CountryDTO("Saint Kitts and Nevis", CountryCode.SA, 53192L, "Terrance Drew",
				Continent.NORTH_AMERICA));
		countries.add(
				new CountryDTO("Saint Lucia", CountryCode.SL, 185113L, "Philip J. Pierre", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Saint Vincent and the Grenadines", CountryCode.SV, 110696L, "Ralph Gonsalves",
				Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Samoa", CountryCode.SA, 221000L, "Naomi Mata'afa", Continent.AUSTRALIA));
		countries.add(new CountryDTO("San Marino", CountryCode.SM, 33832L, "Alessandro Scarano", Continent.EUROPE));
		countries.add(
				new CountryDTO("Sao Tome and Principe", CountryCode.ST, 223364L, "Carlos Vila Nova", Continent.AFRICA));
		countries.add(
				new CountryDTO("Saudi Arabia", CountryCode.SA, 35123400L, "Salman of Saudi Arabia", Continent.ASIA));
		countries.add(new CountryDTO("Senegal", CountryCode.SE, 17454800L, "Macky Sall", Continent.AFRICA));
		countries.add(new CountryDTO("Serbia", CountryCode.SR, 6641000L, "Aleksandar ", Continent.EUROPE));
		countries.add(new CountryDTO("Seychelles", CountryCode.SE, 107120L, "Wavel Ramkalawan", Continent.AFRICA));
		countries.add(new CountryDTO("Sierra Leone", CountryCode.SI, 8600000L, "Julius Maada Bio", Continent.AFRICA));
		countries.add(new CountryDTO("Singapore", CountryCode.SN, 5685807L, "Halimah Yacob", Continent.ASIA));
		countries.add(new CountryDTO("Slovakia", CountryCode.SL, 5435690L, "Zuzana ÄŒaputovÃ¡", Continent.EUROPE));
		countries.add(new CountryDTO("Slovenia", CountryCode.SL, 2100126L, "NataÅ¡a Pirc Musar", Continent.EUROPE));
		countries.add(new CountryDTO("Thailand", CountryCode.TH, 71136531L, "Maha Vajiralongkorn", Continent.ASIA));
		countries.add(new CountryDTO("Timor-Leste", CountryCode.TD, 1387149L, "JosÃ© Ramos-Horta", Continent.ASIA));
		countries.add(new CountryDTO("Togo", CountryCode.TO, 8900000L, "Faure GnassingbÃ©", Continent.AFRICA));
		countries.add(new CountryDTO("Tonga", CountryCode.TG, 100209L, "Tupou VI", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Trinidad and Tobago", CountryCode.TR, 1399491L, "Paula-Mae Weekes",
				Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Tunisia", CountryCode.TW, 12047000L, "Kais Saied", Continent.AFRICA));
		countries.add(new CountryDTO("Turkey", CountryCode.TR, 86530000L, "Recep Tayyip ErdoÄŸan", Continent.ASIA));
		countries
				.add(new CountryDTO("Turkmenistan", CountryCode.TM, 6212000L, "Serdar Berdimuhamedow", Continent.ASIA));
		countries.add(new CountryDTO("Tuvalu", CountryCode.TV, 11200L, "Tofiga Vaevalu Falani", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Uganda", CountryCode.UG, 48385000L, "Yoweri Museveni", Continent.AFRICA));
		countries.add(new CountryDTO("Ukraine", CountryCode.UA, 39958000L, "Volodymyr Zelenskyy", Continent.EUROPE));
		countries.add(new CountryDTO("United Arab Emirates", CountryCode.UA, 9856000L, "Mohammed bin Zayed Al Nahyan",
				Continent.ASIA));
		countries.add(new CountryDTO("United Kingdom", CountryCode.UA, 67215293L, "Charles III", Continent.EUROPE));
		countries
				.add(new CountryDTO("United States", CountryCode.US, 333287557L, "Joe Biden", Continent.NORTH_AMERICA));
		countries.add(new CountryDTO("Uruguay", CountryCode.UY, 3494382L, "Luis Lacalle Pou", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Uzbekistan", CountryCode.UZ, 35628000L, "Shavkat Mirziyoyev", Continent.ASIA));
		countries.add(new CountryDTO("Vanuatu", CountryCode.VN, 319505L, "Nikenike Vurobaravu", Continent.AUSTRALIA));
		countries.add(new CountryDTO("Vatican City", CountryCode.VC, 825L, "Pope Francis", Continent.EUROPE));
		countries.add(
				new CountryDTO("Venezuela", CountryCode.VE, 33262000L, "NicolÃ¡s Maduro", Continent.SOUTH_AMERICA));
		countries.add(new CountryDTO("Vietnam", CountryCode.VN, 100450000L, "Van yung", Continent.ASIA));
		countries.add(new CountryDTO("Yemen", CountryCode.YE, 33697000L, "Mahdi al-Mashat", Continent.ASIA));
		countries.add(new CountryDTO("Zambia", CountryCode.ZA, 20534200L, "Hakainde Hichilema", Continent.AFRICA));
		countries.add(new CountryDTO("Zimbabwe", CountryCode.ZM, 16026000L, "Emmerson Mnangagwa", Continent.AFRICA));

		Iterator<CountryDTO> iterator = countries.iterator();
		while (iterator.hasNext()) {
			CountryDTO ref = iterator.next();
			if (ref.getPopulation() > 250000000) {
				System.out.println("Population greater than 25 cr : " + ref.getName());

			}

		}
		System.out.println("===================");

		Iterator<CountryDTO> iterator1 = countries.iterator();

		while (iterator1.hasNext()) {
			CountryDTO ref = iterator1.next();

			System.out.println("country : " + ref.getName() + "  ==> presidentName : " + ref.getPresidentName());

		}
		System.out.println("===================");

		Iterator<CountryDTO> iterator2 = countries.iterator();

		while (iterator2.hasNext()) {
			CountryDTO ref = iterator2.next();
			if (ref.getCode().getCode() < 50) {

				System.out.println("country : " + ref);
			}

		}
		System.out.println("===================");

		Iterator<CountryDTO> iterator3 = countries.iterator();

		while (iterator3.hasNext()) {
			CountryDTO ref = iterator3.next();

			if (ref.getCode().getCode() < 50 && ref.getName().charAt(0) == 'A') {

				System.out.println("country : " + ref);
			}
		}
		System.out.println("===================");

		Iterator<CountryDTO> iterator4 = countries.iterator();

		while (iterator4.hasNext()) {
			CountryDTO ref = iterator4.next();

			if (ref.getName().contains("I") || ref.getName().contains("i")) {

				System.out.println("country : " + ref);
			}
		}
	}

}
