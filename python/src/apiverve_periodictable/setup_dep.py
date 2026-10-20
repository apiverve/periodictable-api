from setuptools import setup, find_packages

setup(
    name='apiverve_periodictable',
    version='1.2.2',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='Periodic Table retrieves chemical element data by element name or symbol. Responses include atomic number, category, phase, block, standard group and period positions, and CPK hex colors, with paid plans adding atomic mass and thermal metrics.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com/marketplace/periodictable?utm_source=pypi&utm_medium=referral&utm_content=homepage',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
