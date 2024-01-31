ALTER TABLE products
    ADD category_id BIGINT REFERENCES categories (id) NOT NULL;

INSERT INTO products (primary_price, current_price, discount, new_product, image_url, description, min_delivery_days,
                      max_delivery_days, rating, review_count, category_id)
VALUES (341, 340, 18, true, 'image-URL', 'Простынь круглая на резинке EvaKids 75х75х12 бязь (Звезды пэчворк, бежевый)',
        1, 3, 4, 3, 1),
       (302, 300, 20, true, 'image-URL_7', 'Простыня на резинке детская 60х120 "Единорог - Верь в свою мечту"', 1, 5, 3,
        21, 1),
       (470, 500, 10, true, 'image-URL_8', 'Lemony kids Простыня на резинке, Поплин, 75x125 см', 1, 10, 2, 26, 1),
       (606, 600, 5, true, 'image-URL_9',
        'Детский плед 100х110 плюшевый, Вельбоа, однослойный пледик, на выписку для новорожденного Зефир - Сонный гномик 604/10',
        1, 7, 2, 41, 2),
       (861, 890, 7, true, 'image-URL_10',
        'Плед детский для новорожденных мягкий плюшевый / Покрывало в кроватку, коляску, на прогулку', 1, 2, 5, 64, 2),
       (1044, 1070, 3, true, 'image-URL_11',
        'Пеленальная доска для новорожденного на кровать, комод Smikov белый/звезды серые', 1, 1, 5, 32, 3),
       (2536, 3000, 12, true, 'image-URL_12', 'Доска для пеленания BUBO BABY "PRESTIGE" 80х53 см на пластиковой основе',
        1, 20, 4, 41, 3),
       (2011, 1900, 14, true, 'image-URL_13',
        'Пеленальная доска на кроватку 79X45 Sweet Baby Foresta Magica Grigio/oliva (заяц серый/оливковый)', 1, 8, 2,
        26, 3),
       (804, 900, 2, true, 'image-URL_14', 'Пеленальная доска для новорожденного на кровать, комод желтый мишки', 1, 3,
        1, 9, 3),
       (2923, 3100, 50, true, 'image-URL_15',
        'Доска для пеленания BUBO BABY "PRESTIGE ECO" 80х53 см на пластиковой основе', 1, 6, 5, 75, 3),
       (1059, 1300, 25, true, 'image-URL_16', 'Матрасик для пеленания непромокаемый, двухсторонний', 1, 5, 4, 81, 4),
       (474, 750, 45, true, 'image-URL_17', 'Матрас пеленальный на детский комод 60 см. звезды серые', 1, 2, 3, 90, 4),
       (978, 1150, 8, true, 'image-URL_18', 'Кукла пупс в рюкзачке Мой малыш Котенок с бутылочкой', 1, 9, 4, 10, 5),
       (1171, 3200, 13, true, 'image-URL_19', 'Кукла Милли Уроки заботы', 1, 18, 3, 20, 5),
       (1020, 840, 19, true, 'image-URL_20',
        'Кукла пупс Приучаемся к горшку: горшок, памперсы для куклы, аксессуары в комплекте', 1, 4, 2, 2, 5),
       (2565, 2841, 17, true, 'image-URL_21', 'Кукольный дом с мебелью для Барби', 1, 7, 4, 1, 6),
       (959, 764, 15, true, 'image-URL_22', 'Кукольный Домик "Розовый снежок"', 1, 5, 2, 10, 6),
       (450, 350, 9, true, 'image-URL_23',
        'Мотоцикл металлический с подножкой SUZUKI GSХ-R1000, 1:18, игрушка для мальчиков, игрушечный транспорт, модельки машин для малыша',
        1, 3, 3, 11, 7),
       (615, 911, 11, true, 'image-URL_24',
        'Мотоцикл металлический с подножкой YAMAHA YZF-R1, 1:18, игрушка для мальчиков, модельки машин', 1, 6, 4, 14,
        7),
       (521, 498, 23, true, 'image-URL_25',
        'Набор машинок для мальчиков WiMi, полицейские машины с подвижными элементами, игрушечный транспорт металлический, полиция для детей',
        1, 7, 5, 18, 7),
       (521, 654, 32, true, 'image-URL_26',
        'Игрушечный мотоцикл 1TOY CrashFest Moto, Краш фест мото, фрикционный, разборный, набор, 2 шт', 1, 2, 2, 44, 7),
       (1003, 1400, 41, true, 'image-URL_27',
        'Игрушка коллекционная машинка металлическая модель Mercedes-Benz X-class EXY 6x6, джип внедорожник Мерседес pickup с мотоциклом, мерс пикап + байк',
        1, 5, 4, 22, 7),
       (2405, 3400, 51, true, 'image-URL_28',
        'Детская железная дорога с электропоездом со светозвуковыми эффектами, реалистичный ретропоезд с вагонами, интерактивный трек на аккумуляторе для детей от 3 лет',
        1, 3, 3, 65, 8),
       (2437, 2748, 70, true, 'image-URL_29',
        'Большая железная дорога конструктор для детей "Строительный поезд", 92 детали', 1, 8, 1, 41, 8);