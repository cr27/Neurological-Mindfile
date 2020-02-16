# Mindfile
Currently a file that is composed of Mindbytes, the neurogenomic mindbyte, the personality mindbyte, the neuroimaging mindbyte, the neurotranscriptome mindbyte, the neuroproteome mindbyte, and the neurometabolism mindbyte. The mindfile is mainly a postgresql database hosted on the cloud. The mindfile is representative of an individual's neurological identity. This is a prototype.

![image](https://user-images.githubusercontent.com/15940127/57657764-3451e200-7591-11e9-8c02-90eaed6e173c.png)

# MindByte
Essentially meaningless, messy data. However, over time a program running behind the scenes can sort out a user’s mind byte information.  Mindbytes merge together to form something like a mind file, a file containing a user’s neurological identity.



# NeuroimagingMindByte
Neuroimaging MRI data taken from Harvard Dataverse and Allen Brain Atlas stored on desktop.

![image](https://user-images.githubusercontent.com/15940127/59066919-034d9000-8865-11e9-802f-31e5e9d382b0.png)

![image](https://user-images.githubusercontent.com/15940127/61331992-fdd65480-a7d7-11e9-80ed-0dcc202fb740.png)


![image](https://user-images.githubusercontent.com/15940127/61334253-835d0300-a7de-11e9-892c-d7f8a3a2e1d8.png)





## References
https://www.alexejgossmann.com/MRI_viz/

https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/WDIYB5

http://human.brain-map.org/mri_viewers/data


# PersonalityMindByte
Accumulates classical psychometric data through personality assesment. The Big Five Personality Trait Assesment and Fisher Tempermant Inventory are used. Either or both of these assesments serve as examplarary prototypical measurement to associate psychology with neurological identity. For now, just the Big Five Personality Trait Assesment is used to create the PersonalityMindByte. Both of the programs have scores output to the console which are converted to .txt and .csv files. The PersonalityMindByte is used to create part of the mindfile. 

Note: Please read codebook.txt to interpret personality data.

![image](https://user-images.githubusercontent.com/15940127/57659007-9a406880-7595-11e9-9c2b-10ff738b74b3.png)


![image](https://user-images.githubusercontent.com/15940127/73891527-495e5780-4829-11ea-9bba-9ac9850955a4.png)


## References
https://openpsychometrics.org/_rawdata/ (Using data from this source for the time being, this is why I am only using the Big Five assesment).

https://openpsychometrics.org/printable/big-five-personality-test.pdf

https://openpsychometrics.org/tests/FTI/

Brown LL, Acevedo B, Fisher HE (2013). Neural Correlates of Four Broad Temperament Dimensions: Testing Predictions for a Novel Construct of Personality. PLoS ONE 8(11): e78734.



# NeurogenomeMindByte
 The genome mind byte below is a Cerebral Cortex Neurogenome. This genome serves as a reference genome for the neurotranscriptome, neurometabolome and neuroproteome mind bytes.
 
![image](https://user-images.githubusercontent.com/15940127/58767159-54474680-853c-11e9-961e-fdd42f526111.png)


![image](https://user-images.githubusercontent.com/15940127/73891757-ca1d5380-4829-11ea-917c-38f405f844bb.png)


## References
https://amp.pharm.mssm.edu/archs4/data.html


# NeuroTranscriptomeMindByte
The NeuroTranscriptomeMindByte takes RNA-Sequencing datasets associated with the human genome from the Allen Brain Atlas.

![image](https://user-images.githubusercontent.com/15940127/58767118-cc613c80-853b-11e9-8003-d2c53b1a7eb3.png)


![image](https://user-images.githubusercontent.com/15940127/73891883-208a9200-482a-11ea-9607-37c7e1495c0c.png)

## References
http://human.brain-map.org/static/download




# NeuroproteomeMindByte
Takes protein data assocaited with cerebral cortex gene expression from the Human Protein Atlas.

![image](https://user-images.githubusercontent.com/15940127/57658758-de7f3900-7594-11e9-86d3-d2bd70c80de3.png)



![image](https://user-images.githubusercontent.com/15940127/73891916-3ef08d80-482a-11ea-9fad-e41601dc9113.png)


## References
https://www.proteinatlas.org/search/brain_category_rna%3Acerebral+cortex%3BRegion+enriched%2CGroup+enriched%2CRegion+enhanced+AND+sort_by%3Atissue+specific+score

https://www.proteinatlas.org/search/tissue_specificity_rna:cerebral%20cortex;Tissue%20enriched+AND+sort_by:tissue+specific+score+AND+show_columns:groupenriched

https://www.proteinatlas.org/search/tissue_specificity_rna:cerebral%20cortex;elevated+AND+sort_by:tissue+specific+score+AND+show_columns:groupenriched

Uhlén M et al, 2015. Tissue-based map of the human proteome. Science
PubMed: 25613900 DOI: 10.1126/science.1260419	

Yu NY et al, 2015. Complementing tissue characterization by integrating transcriptome profiling from the Human Protein Atlas and from the FANTOM5 consortium. Nucleic Acids Res.
PubMed: 26117540 DOI: 10.1093/nar/gkv608	

Fagerberg L et al, 2014. Analysis of the human tissue-specific expression by genome-wide integration of transcriptomics and antibody-based proteomics. Mol Cell Proteomics.
PubMed: 24309898 DOI: 10.1074/mcp.M113.035600	

Sjöstedt E et al, 2015. Defining the Human Brain Proteome Using Transcriptomics and Antibody-Based Profiling with a Focus on the Cerebral Cortex. PLoS One.
PubMed: 26076492 DOI: 10.1371/journal.pone.0130028	



# NeurometabolicMindbyte
Gene associated metabolome data from the Virtual Metabolic Human webpage

![image](https://user-images.githubusercontent.com/15940127/58769753-f24c0880-855e-11e9-8207-9d947745b47d.png)
![image](https://user-images.githubusercontent.com/15940127/73891985-77906700-482a-11ea-966d-a4f65fbf6672.png)





## References
https://www.vmh.life/





# Installation
### Prerequisites
Winzip

* Winzip, this nifty program helps unzip those .tsv files, .gz files, and .tar files derived from webpages being used to gather and accumulate data.

RStudio

* RStudio is useful for converting non csv files into csv files

http://sqlizer.io/

* Use sqlizer to convert .csv files into MySQL scripts for PostgreSQL

Amazon RDS for PostgreSQL

* Create a PostgreSQL database using Amazon's RDS 

PgAdmin4

* Install PgAdmin4 to gain access to the PostgreSQL Tool that will allow you to add MySQL scripts using the query tool

Netbeans IDE 8.2

* Install Netbeans or any Java platform to connect to the PostgreSQL database

# Usage
Open up Pgadmin4, prepare yourself by getting your postgresql database server name, database master password, and master username. Once these items have been readied right click on where it says servers, from here right click on servers, highlight create and select the  server option. Once you've done this a menu window will appear. You now need to name your server aws-rds or whatever you would like your server name to be. 
![image](https://user-images.githubusercontent.com/15940127/74597511-7a067400-5015-11ea-91b1-16432e786399.png)

Next, open up the connection tab that is attached to the window that is or still should be open. Change the host name to the url found under endpoint on the rds webpage. Change the maintainence database to the name of your master username used to create the postgresql database on amazon's rds website. Then, for the password portion of the connection tab insert rds database password which is the master password created on the postgresql database on amazon's rds website. 

![image](https://user-images.githubusercontent.com/15940127/74597523-b20db700-5015-11ea-8674-385052e3d74c.png)

A new server should now be created with a postgres database attached.


The second part to using the downloaded programs is ensuring all data is formatted to a .csv file, to do this one can use Rstudios to reformat files such as, .tsv to .csv. Example code is shown below with a picture.


![image](https://user-images.githubusercontent.com/15940127/74597997-03ba3f80-501e-11ea-80d1-1bbfface31b3.png)


The third part, once all the files you plan on using for your postgresql database are .csv files you can then convert these to postgresql query tool ready files using http://sqlizer.io/

![image](https://user-images.githubusercontent.com/15940127/74598083-a0c9a800-501f-11ea-8063-4afc54723ec2.png)


Fourth, once you have converted your .csv  files into .sql files you can then use the postgresql query tool in pgadmin4 to create tables within your pgadmin4 server. However, it helps to have notepad++ or an equivalent program so you can copy and paste your sql code into the query tool.
![image](https://user-images.githubusercontent.com/15940127/74598110-50067f00-5020-11ea-8552-de0ffd41ea99.png)
![image](https://user-images.githubusercontent.com/15940127/74598125-9bb92880-5020-11ea-92ac-9b9438485c88.png)

Lastly, use the mindfile source code to connect to the pgadmin4 postgresql tool.
















