USE trafficvance;

CREATE TABLE `campaign` (
  `campaign_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `advertiser_id` int(5) unsigned NOT NULL DEFAULT 0,
  `campaign_status` varchar(255) NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`campaign_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 PACK_KEYS=0;

CREATE TABLE `advertiser` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL DEFAULT '',
  `status` varchar(255) NOT NULL DEFAULT '',
  `company_id` int(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `creatives` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `advertiser_id` smallint(5) unsigned NOT NULL DEFAULT '0',
  `campaign_id` int(11) unsigned NOT NULL DEFAULT '0',
  `budget` decimal(10,2) unsigned DEFAULT NULL,
  `type` enum('POPUP','TEXTLINK','BANNER') NOT NULL DEFAULT 'POPUP',
  `clicks_total` int(11) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 PACK_KEYS=0;