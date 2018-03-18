INSTALL_PATH    = /usr/local
#INSTALL_PATH    = .

CC              = gcc
CXX             = g++
AR              = ar
AS              = as
LD              = ld
STRIP           = strip
RANLIB          = ranlib

INCDIR          = ./include/
SRCDIR          = ./src/
BINDIR          = ./bin/
TESTSDIR        = ./tests/

OK              = \033[30;32mOK\033[m
FAILED          = \033[30;31mFAILED\033[m

defautl: main


SOURCES = \
		BoloBaeta.cpp\
    	main.cpp


OBJS   = $(SOURCES:.cpp=.o)

EXE    = $(BINDIR)$(MODULE)


all: $(EXE)

$(EXE): $(addprefix $(SRCDIR),$(OBJS))
	@echo ==========================================
	@mkdir $(BINDIR) > /dev/null 2>&1 && \
		echo "Criando diretorio $(BINDIR) ... $(OK)" || echo -n ""
	@echo -n Compilando arquivo $(MODULE) estatico ...
	@$(CXX) $(addprefix $(SRCDIR),$(OBJS)) $(CFLAGS) $(LDFLAGS) -lrt -lm -lpthread -o $(EXE) && \
        echo " $(OK)" || (echo " $(FAILED)"; exit 1;)
	@echo Descompactando arquivos de testes e diretórios padões ...
	unzip test.zip
	@mkdir backup > /dev/null 2>&1 && \
		echo "Criando diretorio de backup ... $(OK)" || echo -n ""


%.o: %.cpp
	@echo -n  Compilando arquivo $(notdir $<) para $(notdir $@) ...
	@$(CXX) $(CFLAGS) -c $< -o $@ && \
		echo " $(OK)" || (echo " $(FAILED)"; exit 1;)


clean:
	@echo -n Limpando ...
	@rm -rf $(addprefix $(SRCDIR),$(OBJS)) $(BINDIR) *.bin test backup *.out src/*.o *.txt *.yuv *.bin 2> /dev/null && \
                echo " $(OK)" || (echo " $(FAILED)"; exit 1;)
  