library(ridigbio)

setwd("C:\\Users\\david\\OneDrive - TOWSON UNIVERSITY\\Projects\\NetBeansProjects\\DNN_ImageSampler\\files\\PossibleSpeciesLists")
species = read.table("PassifloraDecaloba.lines.txt", header=F, sep='\t')
species = species$V2

data <- data.frame(matrix(ncol = 3, nrow = 0))
head <- c("Species", "UUID", "URI")
colnames(data) <- head 

badNames = vector()

tot=0
for(sp in species)
	{
	sp <- sub("_", " ", sp)
	print(sp)
	records <- idig_search_media(rq=list(scientificname=sp), mq=list("data.ac:accessURI"=list("type"="exists")), fields=c("uuid","data.ac:accessURI"), limit=500)

	print(nrow(records))

	if(nrow(records)==0) 
		{
		badNames = append(badNames,sp)
		}

	else {
		cnt = 0
		for(i in 1:nrow(records)) {
			uuid = records[[1]][i]
			uri = records[[2]][i]
			data[i+tot,]=NA
			data$Species[i+tot] = sp
			data$UUID[i+tot] = uuid
			data$URI[i+tot] = uri
			print(c(uuid,uri,sp))
			}
		tot = tot+nrow(records)
		}
	}

for( i in 1:nrow(data)) 
	{
	#path = getwd()
	path = "C:\\Users\\david\\Documents\\Projects\\HerbariumDNN\\Images\\"
	#path = paste(path,  sub(" ", "_", data$Species[i]), "_", data$UUID[i], ".jpg", sep="")
	path = paste(path, sub(" ", "_", data$Species[i]), "_", data$UUID[i], ".jpg", sep="")

	print(data$UUID[i])
	print(path)

	if(!is.na(data$UUID[i])) 
		{
		out <- tryCatch(
			{
			download.file(data$URI[i], path, mode='wb')
		 	},
		 error=function(cond) 
		 	{
		 	message(paste("URL does not seem to exist:", data$URI[i]))
			message("Here's the original error message:")
			message(cond)
			 },
		warning=function(cond) 
			{
			message(paste("URL caused a warning:", data$URI[i]))
			message("Here's the original warning message:")
			message(cond)
			},
		finally={
			message(paste("Processed URL:", data$URI[i]))
			}
		) 
		}
	}


