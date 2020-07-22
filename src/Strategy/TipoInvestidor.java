package Strategy;

public enum TipoInvestidor {
	COMUM {
		@Override
		public CalculoInvestimento factoryEnum() {
			return new Poupanca();
		}
	},
	INTELIGENTE

	{
		@Override
		public CalculoInvestimento factoryEnum() {
			return new BomInvestimento();
		}
	};

	public abstract CalculoInvestimento factoryEnum();
}
