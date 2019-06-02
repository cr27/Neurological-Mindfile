# Mindfile
Currently a file that is composed of 5/5 Mindbytes, the neurogenomic mindbyte, the personality mindbyte, the neuroimaging mindbyte, the neurotranscriptome mindbyte, and the neuroproteome mindbyte. The mindfile is a postgresql database hosted on the cloud. The mindfile is representative of an individual's neurological identity. This is a prototype.

![image](https://user-images.githubusercontent.com/15940127/57657764-3451e200-7591-11e9-8c02-90eaed6e173c.png)

![image](https://user-images.githubusercontent.com/15940127/58755005-e8a79f80-848f-11e9-957e-dcf7e4a0c63f.png)



## References
https://amp.pharm.mssm.edu/archs4/data.html

https://www.ebi.ac.uk/gwas/





# MindByte
Essentially meaningless, messy data, extrapolated from various brain data. However, over time a machine learning or graphy theory based program running behind the scenes can sort out a user’s mind byte information.  Mindbytes merge together to form something like a mind file, a file containing a user’s neurological identity.



# NeuroimagingMindByte
Accumulates Neuroimaging data using the mne python tools which provide both MEG and EEG images, and also accumulates Neuroimaging data using MRI images contained in the neurohacking data file provided by the Neurohacking in R coursera course. The Neurological based images generated by both Python and R can be converted to .jpg files and then analyzed by a artificial neural network in python. For now, these analyzed images 
represent the neuroimaging mindbyte. This is a prototype.

![image](https://user-images.githubusercontent.com/15940127/57669547-3ed7a000-75c0-11e9-931f-811e5839c835.png)


# PersonalityMindByte
Accumulates classical psychometric data through personality assesment. The Big Five Personality Trait Assesment and Fisher Tempermant Inventory
are used. Either or both of these assesments serve as examplarary prototypical measurement to associate psychology with neurological identity. For now, just the Big Five Personality Trait Assesment is used to create the PersonalityMindByte. Both of the programs have scores output to the console which are converted to .txt and .csv files. The PersonalityMindByte is used to create part of the mindfile. This is a prototype.

![image](https://user-images.githubusercontent.com/15940127/57659007-9a406880-7595-11e9-9c2b-10ff738b74b3.png)


![image](https://user-images.githubusercontent.com/15940127/57669309-4480b600-75bf-11e9-8466-dbf4484f1e9c.png)


## References
https://openpsychometrics.org/_rawdata/ (Using data from this source for the time being, this is why I am only using the Big Five assesment).

https://openpsychometrics.org/printable/big-five-personality-test.pdf

https://openpsychometrics.org/tests/FTI/

Brown LL, Acevedo B, Fisher HE (2013). Neural Correlates of Four Broad Temperament Dimensions: Testing Predictions for a Novel Construct of Personality. PLoS ONE 8(11): e78734.



# NeurogenomeMindByte
R Studio is capable of taking in Raw 23&Me Genetic Testing Data and comparing it to the GWAS Database to reveal traits about an individual based on scientific research. When the Raw 23&Me data and GWAS database are being compared to one another they can actually be attached together as tables within R. The purpose of comparing and attaching the aforementioned data is so that one can see what scentific results say about each snp within an individuals Raw 23&Me Genetic data. For the purpose of this coding project however, a similar, but new table is created. The new table is composed of the SNP data associated with neurological based research. Currently being used as the neurogenomic mindbyte, but is to be replaced with cerebral cortex genes provided by https://amp.pharm.mssm.edu/archs4/data.html.

![image](https://user-images.githubusercontent.com/15940127/58743882-e6d9cf80-83ee-11e9-83c4-0ea06ee3df6f.png)


## Prerequisites
Rstudio

Microsoft Excel

23&Me Raw Data

## References
https://dabblingwithdata.wordpress.com/2018/07/16/analysing-your-23andme-genetic-data-in-r-part-1-importing-your-genome-into-r/

https://dabblingwithdata.wordpress.com/2018/09/07/analysing-your-23andme-genetic-data-in-r-part-2-exploring-the-traits-associated-with-your-genome/


# NeuroTranscriptomeMindByte
![image](https://user-images.githubusercontent.com/15940127/58755057-b8accc00-8490-11e9-8f2f-5d04ea9f13f7.png)

## References
http://human.brain-map.org/static/download




# NeuroproteomeMindByte
The following is an exact description from the proteinatlas website, "The function of the brain, defined as the central nervous system, is to receive, process and execute the coordinated higher functions of perception, motion and cognition that signify human life. The brain can grossly be divided into different neuroanatomical functional regions such as the frontal, parietal, temporal, occipital lobes and central gray matter structures. The brain can further be stratified into neuron rich grey matter and myelinated white matter. The cellular components of the underlying and highly complex network of transmitted signals include neurons and supportive glial cells. The transcriptome analysis shows that 74% (n=14518) of all human proteins (n=19613) are expressed in the brain and 1460 of these genes show an elevated expression in brain compared to other tissue types. An analysis of the genes with elevated expression in the brain show various patterns of expression in different neurons and glial cells, as well as in neuropil; the meshwork of axons, dendrites, synapses and extra cellular matrix that embed the central nervous system cells."

![image](https://user-images.githubusercontent.com/15940127/57658758-de7f3900-7594-11e9-86d3-d2bd70c80de3.png)


![image](https://user-images.githubusercontent.com/15940127/57669738-21570600-75c1-11e9-8e67-7a1c913201cd.png)


## Prerequisites
Winzip

Microsoft Excel

## References
https://www.proteinatlas.org/humanproteome/tissue/brain

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




